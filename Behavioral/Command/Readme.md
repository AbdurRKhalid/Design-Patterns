# Introduction
The Command Design Pattern is of class *Behavioral* and having subclass of *Object Behavioral*. It helps to convert the request to an object so that decoupling between invoker and handler can be done.

## Intent
Encapsulation of request as an object so that client can be parameterized with different requests, queues and logs and support un-doable operations.

## Also Know As
1. Action
2. Transaction

## Motivation
Sometimes it becomes necessary to issue requests to objects without knowing anything about operation being performed. The common example can be in a user interface that a Button has to send a request after being getting clicked, but handling of this request cannot be handled by the Button itself. It is difficult to determine who will handle the response.
Command Pattern can help to handle this scenario by turning request to object itself. This object can be stored and passed around other objects as well.

## Structure

## Applicability
Use Command Design Pattern When:
1. Callbacks is required in the Object Oriented World.
2. Parametrization of object is required.
3. Specification, Queue and execution of requests at different times is required.
4. Support of undo functionality is required.
