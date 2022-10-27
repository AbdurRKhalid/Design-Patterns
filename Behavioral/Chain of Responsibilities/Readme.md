# Introduction
The Chain of Responsibilities Design Pattern is of class *Behavioral* and having subclass of *Object Behavioral*. It provides the functionality to handle the request to more than one objects.

## Intention
* Avoiding coupling of sender of request to receiver of object, by giving more than one object a chance to handle request.
* Chain receiving objects and pass the request along the chain until an object handles it.