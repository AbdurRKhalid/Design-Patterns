# Introduction
The Iterator Design Pattern is of class *Behavioral* and having subclass of *Object Behavioral*. It provides the facility to explore the underlying functionalities of an aggregated object without looking at underlying representations.

## Intent
Provide a way o access elements of an aggregated object sequentially without looking at the underlying representation.

## Also Known As
**Cursor**

## Motivation
Let's say that we have a list and we want to traverse that list so it is important that we do not bloat that list with different ways of traversal methods, depending upon the situation.
Here Iterator Pattern comes into play. The idea of this pattern is to take responsibility of access and traveling out of list object, and put it into Iterator object.
Iterator defines an interface for accessing list's elements and and Iterator object is responsible for the keeping track of current element.

## Structure

## Applicability
When Iterator Design Pattern When:
1. Access an Aggregate Object's elements without exploring internal representation.
2. To Support multilevel traversals of aggregated objects.

## Consequences
* Support in variations of traversal.
* More than one traversals can be aggregated.