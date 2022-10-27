# Introduction
The Chain of Responsibilities Design Pattern is of class *Behavioral* and having subclass of *Object Behavioral*. It provides the functionality to handle the request to more than one objects.

## Intention
* Avoiding coupling of sender of request to receiver of object, by giving more than one object a chance to handle request.
* Chain receiving objects and pass the request along the chain until an object handles it.

## Motivation
Let's say that we have a Graphics Designing tool and when curse hover any drawing tool, its information should be displayed, but it depends upon the tool and context. If no tool is selected than a general help message should be shown. Now, this creates a chain of objects, that will be handling the response of objects. And it is also interesting to note that each object can pass control to other object if there is not appropriate response.

## Structure

## Applicability
Use Chain of Responsibility Design Pattern When:
1. More than one object might handle the request.
2. Issuing a request to one of several objects without specifying receiver explicitly.
3. Set of objects that can handle a request should be specified dynamically.

## Consequences
* Reduced Coupling.
* Added Flexibility in Assigning Responsibilities to objects.
* Receipt is not guaranteed.