# Introduction
The Facade Design Pattern is of class *Structural* and having subclass of *Object Structural*. It provides the single door to the subsystem using a single interface.

## Intent
* Provides the unified Interface to a set of Interfaces in a subsystem.
* Facade Defines a Higher Level Interface that makes subsystems easier to use.

## Motivation
Let's say we want to provide a main and only access point to subclasses but client has nothing to do with the subclasses and the functionality provided by any subclass, this also provides the intent to make a central gate through which the subsystem can be accessed, and the process of communication can become simpler.
For example, let's say we have a 'Compiler', and there exists the implementation of different functionality such as 'Tokenizing' and 'Parsing' not 'Compiler' Class acts as a Facade for the further functionalities. This makes the usage of the subsystem easy to understand as well as easy to use.

## Structure

## Applicability
Use Facade Design Pattern when:
1. There is a need for a simple Interface to a complex subsystem, as subsystems can become complex by the passage of time.
2. Decoupling of subsystems from its clients and other subsystems is required.
3. If there exists layers in subsystems, use a Facade to define entry point to each subsystem.

## Consequences
* Shields client from subsystem components by limiting the number of objects.
* It promotes the weak coupling between subsystems and clients.
* It does not prevent client to use subsystem classes directly.
