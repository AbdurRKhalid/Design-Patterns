# Introduction
Builder is the Design Pattern of class *Creational* and having subclass of *Object Creational*. It provides the facility to create objects wiht looking under the hood.

## Intent
The main intent of this Design Pattern is to make the creation process same for objects with different representation.

## Motivation
In RICH TEXT Formatter, there should be a possibility to save file in many formats while not changing the existing software or software structure.

## Applicability
1. Creation of the object is independent of parts that makes the object.
2. When there is a need to create different object representation with same process.

## Structure
![BuilderDesignPatternStructure](Builder%20Design%20Pattern%20Structure.png)

## Consequences
* Can help to vary product internal representation -> The internal representation of product is hiddern by the Builder Interface.
* Isolation of code for *Representation* and *Construction*.
* Control over construction Process.