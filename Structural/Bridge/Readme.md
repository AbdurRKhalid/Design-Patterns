# Introduction
The Bridge Design pattern is of class *Structural* and having subclass of *Object*. It provides an easy wa to decouple the interface from its implementation.

## Intent
Decoupling an Abstraction from its implementation so that both or anyone can vary implementation.

## Motivation
Let's say that there exists an interface 'Windows' which contains the different operations related to the windows for example creation and closing of the windows but let's say that there exists classes that has to have different implementation of the windows, so now it becomes really hard to make the Adaptability of the 'Windows' interface for other form of classes, so now this can be solved using the different implementation of the 'Windows' interface.

## Applicability
Use Bridge Design Pattern when:
1. Avoding of Permanent binding between interface and its implementation is required.
2. Both Abstraction and their implementation should be extensible by sub-classing.
3. Changes in the implementation of an abstraction should have no impact on client code.

## Structure

## Cosequences
* Decoupling interface and implementation.
* Improved Extensibility.
* Hiding Implementation details from Client.