package tdt4250.cb.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import tdt4250.cb.Bike;
import tdt4250.cb.CbFactory;
import tdt4250.cb.City;
import tdt4250.cb.Mechanic;
import tdt4250.cb.ServiceReport;
import tdt4250.cb.Station;
import tdt4250.cb.Trip;

public class ImportHelper {

	/**
	 * Fetches station data from Trondheim Bysykkel and adds them to the city object
	 * @param city - The City that owns the stations
	 */
	public static void addStations(City city){
		ObjectMapper mapper = new ObjectMapper();
		try
		{
			URL url = new URL("https://gbfs.urbansharing.com/trondheimbysykkel.no/station_information.json");
			String response = SendGetRequest(url);			
        
			JsonNode node = mapper.readTree(response);
			jsonToStations(node, city);
		}
		catch (Exception e) {
	        System.out.println(e.toString());
	    }
	}
	
	/**
	 * Fetches trip data from Trondheim Bysykkel and adds them to the city object
	 * @param city - The City that owns the trips
	 */
	public static void addTrips(City city) {
		ObjectMapper mapper = new ObjectMapper();
		try
		{
			URL url = new URL("https://data.urbansharing.com/trondheimbysykkel.no/trips/v1/2020/10.json");
			String response = SendGetRequest(url);		
			JsonNode node = mapper.readTree(response);
			jsonToTrips(node, city);
		
		}
		catch (Exception e) {
	        System.out.println(e.toString());
	    }
	}
	
	/**
	 * Creates bike objects and adds them to the city object
	 * @param city - The City that owns the bikes
	 */
	public static void addBikes(City city) {
		CbFactory factory = CbFactory.eINSTANCE;
		ArrayList<String> names = getNames("./src/resources/givenNames.txt");
		for (int i = 0; i < 200; i++) {
			
			Bike bike = factory.createBike();
			bike.setName(names.get(i%names.size()));

			try {
				parkBikeAtRandomStation(city, bike);
			} catch (Exception e) {
				e.printStackTrace();
			}
			city.getBikes().add(bike);
		}
	}
	
	/**
	 * Creates bike objects and adds them to the city object
	 * @param city - The City that owns the bikes
	 */
	public static void addMechanics(City city) {
		CbFactory factory = CbFactory.eINSTANCE;
		
		ArrayList<String> givenNames = getNames("./src/resources/givenNames.txt");
		ArrayList<String> familyNames = getNames("./src/resources/familyNames.txt");
		
		for (int i = 0; i < 20; i++) {
			Mechanic mechanic = factory.createMechanic();
			mechanic.setName(givenNames.get(i%givenNames.size()) + " " + familyNames.get(i%familyNames.size()));			
			city.getMechanics().add(mechanic);
		}
	}
	
	/**
	 * Creates service reports objects and add them to random bike objects
	 * @param city - The City that owns the bikes and mechanics
	 */
	public static void addServiceReports(City city) {
		try {
			generateServiceReports(city);
		} catch (Exception e) {
	    	  System.out.println("An error occurred.");
	    	  e.printStackTrace();
	    }
	}
		
	// PRIVATE METHODS
	/**
	 * Creates service reports for the bikes and mechanics in the city. Add the service report to the Bike.serviceReports
	 * @param city - The City that contains the bikes and mechanics
	 * @throws Exception if no bikes or no mechanics exists
	 */
	private static void generateServiceReports(City city) throws Exception {
		CbFactory factory = CbFactory.eINSTANCE;
		Random rand = new Random();
		String[] content = {"Bra sykkel", "Ok sykkel", "Slitt sykkel"};
		
		if(city.getBikes().size() < 1 || city.getMechanics().size() < 1) {
			throw new Exception("Either no bikes or mechanics in the city.");
		}
		
		for (int i = 0; i < 50; i++) {
			Bike bike = city.getBikes().get(rand.nextInt(city.getBikes().size()));
			ServiceReport serviceReport = factory.createServiceReport();
			serviceReport.setBike(bike);
			serviceReport.setContent(content[i%3]);
			Date serviceTime = new Date(new Date().getTime() - rand.nextInt(10) * 1000000000);
			serviceReport.setTimestamp(serviceTime);
			if (rand.nextInt(10) < 8) {
				Mechanic mechanic = city.getMechanics().get(rand.nextInt(city.getMechanics().size()));
				serviceReport.setMechanic(mechanic);
			}
			bike.getServiceReports().add(serviceReport);
		}
	}
	
	
	/**
	 * Method to send a GET request to an URL
	 * @param url - URL to send the request to
	 * @return The body of the HTTP response (String)
	 * @throws IOException
	 */
	private static String SendGetRequest(URL url) throws IOException {
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		String response = "";
		// Send request 
		BufferedReader in = new BufferedReader(
                new InputStreamReader(
                connection.getInputStream()));
		String inputLine;
		
		while ((inputLine = in.readLine()) != null) 
			response += inputLine;
		in.close();
		
		return response;
	}
	
	/**
	 * Returns names.txt as a list of names
	 * @return ArrayList of names (strings)
	 */
	private static ArrayList<String> getNames(String filePath) {
		ArrayList<String> names = new ArrayList<>();

	    try {
	        File myObj = new File(filePath);
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          names.add(data);
	        }
	        myReader.close();
	      } catch (FileNotFoundException e) {
	    	  System.out.println("An error occurred.");
	    	  e.printStackTrace();
	      }
		return names;
	}
	
	
	/**
	 * Converts a date string to Date object
	 * @param date - A string on the format yyy-MM-dd kk:mm:ss
	 * @return The converted Date
	 * @throws ParseException
	 */
	private static Date stringToDate(String date) throws ParseException {
		   DateFormat df = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss", Locale.ENGLISH);
		   Date result =  df.parse(date);
		   return result;
	}
	
	
	/**
	 * Searches through the stations in the city and returns the one matching the id
	 * @param id - The ID of the station that you want to fetch
	 * @param city - City that contains the station
	 * @return The station with the id
	 * @throws Exception if it can't find a station with the id
	 */
	private static Station getStationByName(String name, City city) throws Exception {
		for (Station station : city.getStations()) {
			if(station.getName().equals(name)) {
				return station;
			}
		}
		throw new Exception("Could not find station by name: " + name);
	}
	
	/**
	 * Fetch a bike from a specific station. If station has no bike, returns a random bike
	 * @param city
	 * @param station
	 * @return 
	 */
	private static Bike getABikeFromStation(City city, Station station) {
		if(station.getAvailableBikes().size() > 0) {
			Bike bike = station.getAvailableBikes().remove(0);
			int numberOfAvailableBikes = station.getCapacityNum() - station.getAvailableBikes().size();
			station.setAvailableDocksNum(numberOfAvailableBikes);
			return bike;
		}else {
			Bike bike = getRandomBike(city);
			Station currentStation = bike.getCurrentStation();
			int numberOfAvailableBikes = currentStation.getCapacityNum() - currentStation.getAvailableBikes().size();
			currentStation.setAvailableDocksNum(numberOfAvailableBikes);
			return bike;
		}
	}
	
	/**
	 * Fetches a random bike
	 * @param city
	 * @return random bike
	 */
	private static Bike getRandomBike(City city) {
		Random rand = new Random();
		int index = rand.nextInt(city.getBikes().size());
		return city.getBikes().get(index);
	}
	
	
	/**
	 * Parks a bike, meaning connecting a bike to a random station and add the bike to Station.AvailableBikes
	 * @param city - The city that contains the bikes and stations
	 * @param bike - The bike to be parked
	 */
	private static void parkBikeAtRandomStation(City city, Bike bike) throws Exception {
		for (Station station : city.getStations()) {
			if(station.getAvailableDocksNum() > 0) {
				bike.setCurrentStation(station);
				station.getAvailableBikes().add(bike);
				int numberOfAvailableBikes = station.getCapacityNum() - station.getAvailableBikes().size();
				station.setAvailableDocksNum(numberOfAvailableBikes);
				break;
			}
		}
	}
	
	/**
	 * Parks bike at a Station, if not any available docks then picks a random station
	 * @param city
	 * @param bike
	 * @param station
	 */
	private static void parkBikeAtStation(City city, Bike bike, Station station) throws Exception {
		if(station.getAvailableDocksNum() == 0) {
			parkBikeAtRandomStation(city, bike);
		}
		bike.setCurrentStation(station);
		station.getAvailableBikes().add(bike);
		int numberOfAvailableBikes = station.getCapacityNum() - station.getAvailableBikes().size();
		station.setAvailableDocksNum(numberOfAvailableBikes);
	}
	
	
	/**
	 * Translate JSON to Trip objects and add them to the city
	 * @param json - JSON object that contains information about trips
	 * @param city - The city that the trips will be added to
	 * @throws Exception
	 */
	private static void  jsonToTrips(JsonNode json, City city) throws Exception {
		for (int i = 0; i < 500; i++) {
			JsonNode tripJson = json.get(i);
			
			CbFactory factory = CbFactory.eINSTANCE;
			Trip trip = factory.createTrip();
			String startStationName = tripJson.get("start_station_name").textValue();
			String endStationName = tripJson.get("end_station_name").textValue();
			int duration = tripJson.get("duration").asInt();
			Station startStation = getStationByName(startStationName, city);
			Station endStation = getStationByName(endStationName, city);
			Bike bike = getABikeFromStation(city, startStation);

			trip.setId(i+1);
			trip.setStartStation(startStation);
			trip.setEndStation(endStation);
			trip.setDuration(duration);
			trip.setStartTime(stringToDate(tripJson.get("started_at").asText()));
			trip.setEndTime(stringToDate(tripJson.get("ended_at").asText()));
			trip.setBike(bike);
			city.getTrips().add(trip);
			
			parkBikeAtStation(city, bike, endStation);
		}
	}
	
	
	/**
	 * Translate JSON to Station objects and add them to the city
	 * @param json - JSON object that contains information about trips
	 * @param city - The city that the trips will be added to
	 * @throws Exception
	 */
	private static void jsonToStations(JsonNode json, City city){
		JsonNode stationsJson = json.get("data").get("stations");
	
		for (int i = 0; i < stationsJson.size(); i++) {
			JsonNode stationJson = stationsJson.get(i);
			
			CbFactory factory = CbFactory.eINSTANCE;

			Station station = factory.createStation();
			
			station.setName(stationJson.get("name").textValue());
			station.setAddress(stationJson.get("address").textValue());
			station.setCapacityNum(stationJson.get("capacity").asInt());
			station.setYCoordinate(stationJson.get("lat").floatValue());
			station.setXCoordinate(stationJson.get("lon").floatValue());
			station.setAvailableDocksNum(stationJson.get("capacity").asInt());

			city.getStations().add(station);
		}
	}
	
}
