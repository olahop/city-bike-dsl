# City Bike DSL (TDT4250 Project)

```
TODO: sjekk ut markdown fila i editor og se over ting som er kommentert ut, samt fikse TODOs
```

City Bike DSL is, as the name suggest, a DSL within the domain of city bikes, which is built with the Eclipse technology Sirius. The project was developed as part of the course TDT4250 Advanced Software Design at the Norwegian University of Science and Technology.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

These are technologies needed to follow this installation guide and get the software up and running:

- [Git](https://git-scm.com/)
- [Eclipse IDE](https://www.eclipse.org/ide/)
<!-- - [Graphviz v2.38](https://graphviz.org/download/) -->

This project utilize a set of specific plug-ins. The easiest way to install these is to start Eclipse with the package named "Eclipse Java and DSL developers". When the IDE is opened, plug-ins can be installed through "Help" > "Install New Software...". Between each of the following - click **`Next`** and then **`Finished`**.

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

Follow the instructions below to get a demo of the project running localy.

1. Open the Eclipse Wizard by hitting "File" > "Import...".
2. Select Git > Projects from Git (with smart import) and press **`Next`**.
3. Select Clone URl and press **`Next`**.

```
TODO: endre lenke sammen med repo-navn til "city-bike-dsl"
```

4. In the URl field paste the following link and press **`Next`**: https://github.com/olahop/tdt4520-project.git
5. To complete the import with the default configurations, press **`Next`** in the occuring pages, and then **`Finish`**.
6. To run the DSL - right click the _`tdt4250.cb.model`_ package and run this as an Eclipse Application.

```
TODO: her kommer noen ekstra steg om hvordan man åpner det første viewet og navigerer mellom views (tror det er mulig å sette et view som default når man starter opp .aird-fila - undersøker..). Kommer også et steg om hvordan man laster inn oppdatert data til CityBike.xmi.
```

## Built With

- [Eclipse Modelling Framework (EMF)](https://www.eclipse.org/modeling/emf/) - Used to build a model of the city bike domain as the foundation of the DSL
- [Sirius](https://www.eclipse.org/sirius/) - Userd to create custom graphical modeling workbenches

```
TODO: mer?
```

### Eclipse Modeling Framework

```
TODO: TBA om nødvendig å si noe
```

### Sirius

```
TODO: ting vi har brukt og prøvd, samt hvor.
```

## Authors

- **Anders Hoelseth** - _Sirius Guy_ - [anderhre](https://github.com/anderhre)
- **Henrik Rudi Næss** - _Sirius Fella_ - [henrikrn-ntnu](https://github.com/henrikrn-ntnu)
- **Håvard Farestveit** - _Sirius Dude_ - [Havfar](https://github.com/Havfar)
- **Ola Hermann Opheim** - _Sirius Bloke_ - [olahop](https://github.com/olahop)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

```
TODO: legg inn en liten shout-out dersom vi har hentet kode/inspirasjon fra noe sted
```
