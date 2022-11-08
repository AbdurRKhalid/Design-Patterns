# Introduction
The Memento Design Pattern is of class _Behavioral_ and having subclass of _Object Behavioral_. It promotes the capturing of the state of the object without violating the condition of the encapsulation.

## Aslo Known As
**Token**

## Motivation
Let's say that you want to implement a redo functionality then it requires the saving of the internal state of the object somewhere so that when there is a need of restoring it can be restored, but indirectly it will voilate the implementation of the encapsulation. The most common example of this can be let's say that you are building a graphics software and you want to add a rectangle to the canvas, and then you want to remove that from canvas, so this is a normal example of the redo functionality. Here, this scenario can be handled using a **ConstraintSolver**.

**Memento** is an object that stores the a snapshot of internal state of another object which is called the Mementor Originator. For the implementation of the undo option Memento will request the state of previous step and try to restore it.

## Structure

## Applicability
Use Memento Design Pattern When:
1. A Snapshot of an object's state must be saved so that it can be restored.
2. A Direct Interface to Obtaining the state would expose implementation details and break encapsulation principle.

## Consequences
* Preserving the Encapsulation Boundries.
* It simplifies Originator.
* Using Mementos Might Be Expensive in Behaviour.
* Defining Narrow and Wide Interfaces.
* Hidden Costs in Caring for Memento.