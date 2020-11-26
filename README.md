# City Bike DSL (TDT4250 Project)

```
TODO: sjekk ut markdown fila i editor og se over ting som er kommentert ut, samt fikse TODOs
```

City Bike DSL is, as the name suggests, a DSL within the domain of city bikes, which is built with the Eclipse technology Sirius. The project was developed as part of the course TDT4250 Advanced Software Design at the Norwegian University of Science and Technology.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

These are technologies needed to follow this installation guide and get the software up and running:

- [Git](https://git-scm.com/)
- [Eclipse IDE](https://www.eclipse.org/ide/)
<!-- - [Graphviz v2.38](https://graphviz.org/download/) -->

This project utilizes a set of specific plug-ins. The easiest way to install these is to start Eclipse with the package named "Eclipse Java and DSL developers". When the IDE is opened, plug-ins can be installed through "Help" > "Install New Software...". Between each of the following - click **`Next`** and then **`Finished`**.

```
TODO: sjekk om vi trenger alle disse - de er hentet fra Course Information på innsida.
```

- From the standard software site (select Eclipse 2020-06 in drop-down) and with Group Items by Category checked:

  - Acceleo
  - Ecore Diagram Editor (SDK)
  - EMF Forms SDK
  - Sirius Specifier Environment
  - Sirius Properties Views

- From the standard software site (select Eclipse 2020-06 in drop-down) and with Group Items by Category un-checked:

  - Acceleo Query SDK

- From the software site http://hallvard.github.io/plantuml (type into text field):
  - PlantUML Eclipse support > PlantUML Ecore Feature and PlantUML Feature
  - PlantUML Library > PlantUML Library Feature

<!-- In addition, install the graphviz command line application and register its path to dot executable in the PlantUML preferences in Eclipse. The Eclipse PlantUML plugin is incompatible with the latest graphviz version, so use v2.38. -->

```
TODO: denne har ikke jeg installert - er den benyttet?
```

- From the emfjson site http://ghillairet.gihub.io/p2:

  - EMF Json (Jackson)

- From the software site http://download.eclipse.org/tools/orbit/downloads/drops/R20170919201930/repository:

  - All Bundles > Jackson-annotations
  - All Bundles > Jackson-core
  - All Bundles > Jackson-databind

Restart Eclipse when all the plug-ins have been installed.

### Installing

Follow the instructions below to get a demo of the project running locally.

1. Open the Eclipse Wizard by hitting "File" > "Import...".
2. Select Git > Projects from Git (with smart import) and press **`Next`**.
3. Select Clone URl and press **`Next`**.
4. In the URl field paste the following link and press **`Next`**: https://github.com/olahop/city-bike-dsl.git
5. To complete the import with the default configurations, press **`Next`** in the occuring pages, and then **`Finish`**.
6. To run the DSL - right click the _`tdt4250.cb.model`_ package and run this as an Eclipse Application.

```
TODO: her kommer noen ekstra steg om hvordan man åpner det første viewet og navigerer mellom views (tror det er mulig å sette et view som default når man starter opp .aird-fila - undersøker..). Kommer også et steg om hvordan man laster inn oppdatert data til CityBike.xmi.
```

## Built With

- [Eclipse Modelling Framework (EMF)](https://www.eclipse.org/modeling/emf/) - Used to build a model of the city bike domain as the foundation of the DSL
- [Sirius](https://www.eclipse.org/sirius/) - Used to create custom graphical modeling workbenches

```
TODO: andre teknologier benyttet?
```

### Eclipse Modeling Framework

```
TODO: TBA om nødvendig å si noe
```

### Sirius

```
TODO-for seksjon: tar utgangspunkt i de ulike viewpointene. beskriver ting vi har brukt, hvorfor og hvordan man tester runtime. beskriver ting vi har prøvd på, til hvilken funksjon i view'et og hvorfor. Anta at installasjons-seksjonen dekker navigasjon sånn at man finner det riktige view'et - her er det snakk om funksjonalitet inne i selve view'et.
```

This section is meant to highlight which features of the Sirius technology has been used to develop the DSL and how these features can be seen and tested within the runtime-environment.

#### Admin Viewpoint

```
TODO: mer info kommer. avventer om alle nevnte views skal med når analyticsview evt kommer eller blir bakt inn i dette viewpointet.
```

The admin viewpoint consists of three representations:

##### BikesAtStation Diagram

This diagram representation displays Stations, Bikes and edges between Bikes and the Station they are currently at.
It is a very visual representation and the user can right-click to add new Stations or Bikes (or use the NodeCreation tool) and use the EdgeCreation tool to set or change the location of a Bike.
##### StationOverview Tree

This tree representation shows the same information as the BikesAtStation diagram, but is more neatly structured, meaning that a specific station is easier to find.
The user can right-click any tree item to add a new Station.

##### Mechanics Table

This table representation is an overview of all the Mechanics. New Mechanics can be added through right-clicking, and existing Mechanics can be edited through the properties panel.

#### Analytics Viewpoint

```
TODO: mer info kommer. avventer om alle nevnte views skal med når analyticsview evt kommer eller blir bakt inn i dette viewpointet.
```

#### Mechanic Viewpoint

This viewpoint consists of a single tree representation - ServiceReportTree. The view consists of a list of the bikes in the current city, sorted by longest time since last service. Within each bike node of the tree, are the service reports related to the bike.

It is possible to create a new service report for a bike by right clicking and selecting "Create Service Report". The new service report, along with other service reports can then be edited with the use of the customized properties panel. The specific features of this panel is mentioned in the [CustomProperties section](#CustomProperties).

Java Services is used to filter and render the bikes of this view correctly. It is also used to set the current timestamp on newly created service reports. The code behind this can be found in _`/tdt4250.cb.diagram/src/tdt4250/cb/diagram/Services.java`_. Aql is used to give bikes and service reports their labels. The bike labels contain the bikes name, total number of service reports, and the timestamp of the last service report. Service report labels contain the name of the mechanic and the content of the report. Different colored icons indicate if the bike is in need of service or not, based on the time since last service.

#### User Viewpoint

```
TODO: mer info kommer. få med hva som er i det aktuelle diagrammet, og hvordan vi har sett på å få med layout.
```

#### CustomProperties

The customized properties view is used to facilitate changing information as part of the DSL.

The ServiceReport panel makes it possible to edit service reports through selecting a mechanic and editing the contents of the report. Aql is used to find the mechanics registered in the same city as the bike, and display these by name through the _candidate_ variable.

```
TODO: evt legge til andre endringspanel vi lager.
```

## Authors

- **Anders Hoelseth** - _Sirius Guy_ - [anderhre](https://github.com/anderhre)
- **Henrik Rudi Næss** - _Sirius Fella_ - [henrikrn-ntnu](https://github.com/henrikrn-ntnu)
- **Håvard Farestveit** - _Sirius Dude_ - [Havfar](https://github.com/Havfar)
- **Ola Hermann Opheim** - _Sirius Bloke_ - [olahop](https://github.com/olahop)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## Acknowledgments

```
TODO: legg inn en liten shout-out dersom vi har hentet kode/inspirasjon fra noe sted
```
