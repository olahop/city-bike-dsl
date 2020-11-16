# tdt4250-project

## Sirius

Currently, the examples is very much inspired by the Sirius-lecture. Note that the implementation of tools is missing (these are covered from around 01:02:40 in the lecture). _tdt4250.cb.diagram/description/diagram.odesign_ is where the views are created. I have created a simple view diagram- and tree-view based on the lecture. To see the view while editing it one can go to _tdt4250.cb.diagram2.examples/representations.aird_, this is supposed to connect the views and the xmi-instances. I experience a bug when I try to add/remove models in the aird-file, and the representations does not seem to get saved.

### Admin viewpoint
The admin viewpoint consists of three representations: 

#### BikesAtStation Diagram
This diagram representation displays Stations, Bikes and an edge between Bikes and the Station they are currently at.
It is a very visual representation where the user can right-click to add new Stations or Bikes (or use the NodeCreation tool) and use the EdgeCreation tool to set or change the location of a Bike.

#### BikesAtStation Tree
This tree representation is very similar to the BikesAtStation diagram, but is more neatly structured, meaning that a specific station is easier to find.
The user can right-click any Station to add a new Station, or right-click a Station to add a new Bike to the selected Station.

#### Mechanics Table
This table representation is an overview of all the Mechanics. New Mechanics can be added through right-clicking, and existing Mechanics can be edited through the properties panel.

## Installation

How to install Jackson

- Open "Install new software.." in Eclipse
- Click **`Add`**
- Enter Name: **`Orbit`** and Location: **`http://download.eclipse.org/tools/orbit/downloads/drops/R20170919201930/repository`**.
- Click **`Add`**
- Select **`All bundeles`** and check **`Jackson-annotations`**, **`Jackson-core`** and **`Jackson-databind`**
- Click **`Next`** and then **`Finished`**
- Restart Eclipse

