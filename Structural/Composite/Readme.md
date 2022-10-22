# Introduction
The Composite Design Pattern is of class *Structural* and having subclass of *Object Structural*. It helps to composite the objects having compound structures.

## Intent
* Compose objects in form of the tree architecture to depict the part-whole architecture of objects.
* Let client treat individual and composition of objects uniformly.

## Motivation
In a normal drawing application or editor, we have simple components and those components can be grouped together to form more complex components. Composite Design Pattern provides a simple aggregation implementation that can help to handle this regression.

## Applicability
Use Composite Design Pattern When:
1. Part-Whole representation of hierarchies of objects required.
2. Ignorance of Individual and composition of objects required.

## Structure
![CompositeDesignPattern](./Composite%20Design%20Pattern.png)

## Consequences
* Makes easy to add new components.
* Can be used to make design overly general.
* Makes the client or test easy.