# Introduction
Singleton is Design Pattern of class *Creational* and having subclass of *Object Creational*. It provides the restriction on classes to create only one instance of the specified class.

## Intent
Sometimes it is very important that one class has only one instance for example, there should exists only 'Windows Manager' or only one 'Database Connection' instance in the whole project.

## Applicability
Use the Singleton Design Pattern when:
* There must be exactly one instance of class and there should exist one point of access.
* When sole instance should be extensible by subclassing and client should be able to use it without any further modification.

## Structure
![SingletonDesignPattern](Singleton%20Design%20Pattern.png)

## Consequences
1. Controlled access to sole instance.
2. Reduction in namespace.
3. Permits refinement in operations and representation.
4. Permits a variable number of instance.
5. More flexible than class operations.