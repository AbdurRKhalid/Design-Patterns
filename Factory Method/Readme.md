# Introduction
Factory Method is Design Pattern of class *Creational* and having subclass of *Class Creational* Factory Method is design pattern used to allow subclasses to create the object alongside with main parent class as well.

## Intent
Defining the interface for creating object, but let subclass to decide which class to instantiate, that means that let a class defer instantiation to subclass.

## Also Know As
Virtual Constructor

## Motivation
Let's say we have two classes 'Application' and 'Document'. The client has implemented the Application class but Application class does not know how to initiate 'Create Document' method but due to various types of documents so, how to manage different types of creation of the documents.

## Applicability
Factory Method Design Pattern can be used when:
1. A Class cannot anticipate the class of object it must create.
2. A Class wants its subclass to specify the objects it creates.