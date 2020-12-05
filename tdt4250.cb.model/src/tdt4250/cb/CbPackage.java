/**
 */
package tdt4250.cb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tdt4250.cb.CbFactory
 * @model kind="package"
 * @generated
 */
public interface CbPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/tdt4250.cb.model/model/cb.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CbPackage eINSTANCE = tdt4250.cb.impl.CbPackageImpl.init();

	/**
	 * The meta object id for the '{@link tdt4250.cb.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.cb.impl.CityImpl
	 * @see tdt4250.cb.impl.CbPackageImpl#getCity()
	 * @generated
	 */
	int CITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Bikes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__BIKES = 1;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__STATIONS = 2;

	/**
	 * The feature id for the '<em><b>Mechanics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__MECHANICS = 3;

	/**
	 * The feature id for the '<em><b>Trips</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__TRIPS = 4;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.cb.impl.StationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.cb.impl.StationImpl
	 * @see tdt4250.cb.impl.CbPackageImpl#getStation()
	 * @generated
	 */
	int STATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>XCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__XCOORDINATE = 2;

	/**
	 * The feature id for the '<em><b>YCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__YCOORDINATE = 3;

	/**
	 * The feature id for the '<em><b>Capacity Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__CAPACITY_NUM = 4;

	/**
	 * The feature id for the '<em><b>Available Docks Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__AVAILABLE_DOCKS_NUM = 5;

	/**
	 * The feature id for the '<em><b>Available Bikes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__AVAILABLE_BIKES = 6;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.cb.impl.TripImpl <em>Trip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.cb.impl.TripImpl
	 * @see tdt4250.cb.impl.CbPackageImpl#getTrip()
	 * @generated
	 */
	int TRIP = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__ID = 0;

	/**
	 * The feature id for the '<em><b>Start Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__START_STATION = 1;

	/**
	 * The feature id for the '<em><b>End Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__END_STATION = 2;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__START_TIME = 3;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__END_TIME = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__DURATION = 5;

	/**
	 * The feature id for the '<em><b>Bike</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__BIKE = 6;

	/**
	 * The number of structural features of the '<em>Trip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Trip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.cb.impl.BikeImpl <em>Bike</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.cb.impl.BikeImpl
	 * @see tdt4250.cb.impl.CbPackageImpl#getBike()
	 * @generated
	 */
	int BIKE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Current Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__CURRENT_STATION = 1;

	/**
	 * The feature id for the '<em><b>Last Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__LAST_SERVICE_TIME = 2;

	/**
	 * The feature id for the '<em><b>Service Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__SERVICE_REPORTS = 3;

	/**
	 * The number of structural features of the '<em>Bike</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bike</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.cb.impl.MechanicImpl <em>Mechanic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.cb.impl.MechanicImpl
	 * @see tdt4250.cb.impl.CbPackageImpl#getMechanic()
	 * @generated
	 */
	int MECHANIC = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANIC__NAME = 0;

	/**
	 * The number of structural features of the '<em>Mechanic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANIC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mechanic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.cb.impl.ServiceReportImpl <em>Service Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.cb.impl.ServiceReportImpl
	 * @see tdt4250.cb.impl.CbPackageImpl#getServiceReport()
	 * @generated
	 */
	int SERVICE_REPORT = 5;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REPORT__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Bike</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REPORT__BIKE = 1;

	/**
	 * The feature id for the '<em><b>Mechanic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REPORT__MECHANIC = 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REPORT__TIMESTAMP = 3;

	/**
	 * The number of structural features of the '<em>Service Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REPORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REPORT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tdt4250.cb.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see tdt4250.cb.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.cb.City#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.cb.City#getName()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.cb.City#getBikes <em>Bikes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bikes</em>'.
	 * @see tdt4250.cb.City#getBikes()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Bikes();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.cb.City#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stations</em>'.
	 * @see tdt4250.cb.City#getStations()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Stations();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.cb.City#getMechanics <em>Mechanics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mechanics</em>'.
	 * @see tdt4250.cb.City#getMechanics()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Mechanics();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.cb.City#getTrips <em>Trips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trips</em>'.
	 * @see tdt4250.cb.City#getTrips()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Trips();

	/**
	 * Returns the meta object for class '{@link tdt4250.cb.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station</em>'.
	 * @see tdt4250.cb.Station
	 * @generated
	 */
	EClass getStation();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.cb.Station#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.cb.Station#getName()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Name();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.cb.Station#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see tdt4250.cb.Station#getAddress()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Address();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.cb.Station#getXCoordinate <em>XCoordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XCoordinate</em>'.
	 * @see tdt4250.cb.Station#getXCoordinate()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_XCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.cb.Station#getYCoordinate <em>YCoordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YCoordinate</em>'.
	 * @see tdt4250.cb.Station#getYCoordinate()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_YCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.cb.Station#getCapacityNum <em>Capacity Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity Num</em>'.
	 * @see tdt4250.cb.Station#getCapacityNum()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_CapacityNum();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.cb.Station#getAvailableDocksNum <em>Available Docks Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Docks Num</em>'.
	 * @see tdt4250.cb.Station#getAvailableDocksNum()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_AvailableDocksNum();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.cb.Station#getAvailableBikes <em>Available Bikes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Available Bikes</em>'.
	 * @see tdt4250.cb.Station#getAvailableBikes()
	 * @see #getStation()
	 * @generated
	 */
	EReference getStation_AvailableBikes();

	/**
	 * Returns the meta object for class '{@link tdt4250.cb.Trip <em>Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trip</em>'.
	 * @see tdt4250.cb.Trip
	 * @generated
	 */
	EClass getTrip();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.cb.Trip#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tdt4250.cb.Trip#getId()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_Id();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.cb.Trip#getStartStation <em>Start Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Station</em>'.
	 * @see tdt4250.cb.Trip#getStartStation()
	 * @see #getTrip()
	 * @generated
	 */
	EReference getTrip_StartStation();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.cb.Trip#getEndStation <em>End Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Station</em>'.
	 * @see tdt4250.cb.Trip#getEndStation()
	 * @see #getTrip()
	 * @generated
	 */
	EReference getTrip_EndStation();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.cb.Trip#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see tdt4250.cb.Trip#getStartTime()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.cb.Trip#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see tdt4250.cb.Trip#getEndTime()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.cb.Trip#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see tdt4250.cb.Trip#getDuration()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_Duration();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.cb.Trip#getBike <em>Bike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bike</em>'.
	 * @see tdt4250.cb.Trip#getBike()
	 * @see #getTrip()
	 * @generated
	 */
	EReference getTrip_Bike();

	/**
	 * Returns the meta object for class '{@link tdt4250.cb.Bike <em>Bike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bike</em>'.
	 * @see tdt4250.cb.Bike
	 * @generated
	 */
	EClass getBike();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.cb.Bike#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.cb.Bike#getName()
	 * @see #getBike()
	 * @generated
	 */
	EAttribute getBike_Name();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.cb.Bike#getCurrentStation <em>Current Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Station</em>'.
	 * @see tdt4250.cb.Bike#getCurrentStation()
	 * @see #getBike()
	 * @generated
	 */
	EReference getBike_CurrentStation();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.cb.Bike#getLastServiceTime <em>Last Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Service Time</em>'.
	 * @see tdt4250.cb.Bike#getLastServiceTime()
	 * @see #getBike()
	 * @generated
	 */
	EAttribute getBike_LastServiceTime();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.cb.Bike#getServiceReports <em>Service Reports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Reports</em>'.
	 * @see tdt4250.cb.Bike#getServiceReports()
	 * @see #getBike()
	 * @generated
	 */
	EReference getBike_ServiceReports();

	/**
	 * Returns the meta object for class '{@link tdt4250.cb.Mechanic <em>Mechanic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mechanic</em>'.
	 * @see tdt4250.cb.Mechanic
	 * @generated
	 */
	EClass getMechanic();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.cb.Mechanic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.cb.Mechanic#getName()
	 * @see #getMechanic()
	 * @generated
	 */
	EAttribute getMechanic_Name();

	/**
	 * Returns the meta object for class '{@link tdt4250.cb.ServiceReport <em>Service Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Report</em>'.
	 * @see tdt4250.cb.ServiceReport
	 * @generated
	 */
	EClass getServiceReport();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.cb.ServiceReport#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see tdt4250.cb.ServiceReport#getContent()
	 * @see #getServiceReport()
	 * @generated
	 */
	EAttribute getServiceReport_Content();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.cb.ServiceReport#getBike <em>Bike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bike</em>'.
	 * @see tdt4250.cb.ServiceReport#getBike()
	 * @see #getServiceReport()
	 * @generated
	 */
	EReference getServiceReport_Bike();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.cb.ServiceReport#getMechanic <em>Mechanic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mechanic</em>'.
	 * @see tdt4250.cb.ServiceReport#getMechanic()
	 * @see #getServiceReport()
	 * @generated
	 */
	EReference getServiceReport_Mechanic();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.cb.ServiceReport#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see tdt4250.cb.ServiceReport#getTimestamp()
	 * @see #getServiceReport()
	 * @generated
	 */
	EAttribute getServiceReport_Timestamp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CbFactory getCbFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tdt4250.cb.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.cb.impl.CityImpl
		 * @see tdt4250.cb.impl.CbPackageImpl#getCity()
		 * @generated
		 */
		EClass CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__NAME = eINSTANCE.getCity_Name();

		/**
		 * The meta object literal for the '<em><b>Bikes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__BIKES = eINSTANCE.getCity_Bikes();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__STATIONS = eINSTANCE.getCity_Stations();

		/**
		 * The meta object literal for the '<em><b>Mechanics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__MECHANICS = eINSTANCE.getCity_Mechanics();

		/**
		 * The meta object literal for the '<em><b>Trips</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__TRIPS = eINSTANCE.getCity_Trips();

		/**
		 * The meta object literal for the '{@link tdt4250.cb.impl.StationImpl <em>Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.cb.impl.StationImpl
		 * @see tdt4250.cb.impl.CbPackageImpl#getStation()
		 * @generated
		 */
		EClass STATION = eINSTANCE.getStation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__NAME = eINSTANCE.getStation_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__ADDRESS = eINSTANCE.getStation_Address();

		/**
		 * The meta object literal for the '<em><b>XCoordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__XCOORDINATE = eINSTANCE.getStation_XCoordinate();

		/**
		 * The meta object literal for the '<em><b>YCoordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__YCOORDINATE = eINSTANCE.getStation_YCoordinate();

		/**
		 * The meta object literal for the '<em><b>Capacity Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__CAPACITY_NUM = eINSTANCE.getStation_CapacityNum();

		/**
		 * The meta object literal for the '<em><b>Available Docks Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__AVAILABLE_DOCKS_NUM = eINSTANCE.getStation_AvailableDocksNum();

		/**
		 * The meta object literal for the '<em><b>Available Bikes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION__AVAILABLE_BIKES = eINSTANCE.getStation_AvailableBikes();

		/**
		 * The meta object literal for the '{@link tdt4250.cb.impl.TripImpl <em>Trip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.cb.impl.TripImpl
		 * @see tdt4250.cb.impl.CbPackageImpl#getTrip()
		 * @generated
		 */
		EClass TRIP = eINSTANCE.getTrip();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__ID = eINSTANCE.getTrip_Id();

		/**
		 * The meta object literal for the '<em><b>Start Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP__START_STATION = eINSTANCE.getTrip_StartStation();

		/**
		 * The meta object literal for the '<em><b>End Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP__END_STATION = eINSTANCE.getTrip_EndStation();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__START_TIME = eINSTANCE.getTrip_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__END_TIME = eINSTANCE.getTrip_EndTime();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__DURATION = eINSTANCE.getTrip_Duration();

		/**
		 * The meta object literal for the '<em><b>Bike</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP__BIKE = eINSTANCE.getTrip_Bike();

		/**
		 * The meta object literal for the '{@link tdt4250.cb.impl.BikeImpl <em>Bike</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.cb.impl.BikeImpl
		 * @see tdt4250.cb.impl.CbPackageImpl#getBike()
		 * @generated
		 */
		EClass BIKE = eINSTANCE.getBike();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIKE__NAME = eINSTANCE.getBike_Name();

		/**
		 * The meta object literal for the '<em><b>Current Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIKE__CURRENT_STATION = eINSTANCE.getBike_CurrentStation();

		/**
		 * The meta object literal for the '<em><b>Last Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIKE__LAST_SERVICE_TIME = eINSTANCE.getBike_LastServiceTime();

		/**
		 * The meta object literal for the '<em><b>Service Reports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIKE__SERVICE_REPORTS = eINSTANCE.getBike_ServiceReports();

		/**
		 * The meta object literal for the '{@link tdt4250.cb.impl.MechanicImpl <em>Mechanic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.cb.impl.MechanicImpl
		 * @see tdt4250.cb.impl.CbPackageImpl#getMechanic()
		 * @generated
		 */
		EClass MECHANIC = eINSTANCE.getMechanic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MECHANIC__NAME = eINSTANCE.getMechanic_Name();

		/**
		 * The meta object literal for the '{@link tdt4250.cb.impl.ServiceReportImpl <em>Service Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.cb.impl.ServiceReportImpl
		 * @see tdt4250.cb.impl.CbPackageImpl#getServiceReport()
		 * @generated
		 */
		EClass SERVICE_REPORT = eINSTANCE.getServiceReport();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REPORT__CONTENT = eINSTANCE.getServiceReport_Content();

		/**
		 * The meta object literal for the '<em><b>Bike</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REPORT__BIKE = eINSTANCE.getServiceReport_Bike();

		/**
		 * The meta object literal for the '<em><b>Mechanic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REPORT__MECHANIC = eINSTANCE.getServiceReport_Mechanic();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REPORT__TIMESTAMP = eINSTANCE.getServiceReport_Timestamp();

	}

} //CbPackage
