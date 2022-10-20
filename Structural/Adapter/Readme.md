# Introduction
The Adapter Design Pattern is of class *Structural* and have sub class of both *Object and Class*. It provides the functionality to make one class adapt the interface or other class.

## Intent
Convert one interface to other that is expected by client, Adapter let's those classes work together that otherwise could not due to compatibility problems related to interfaces.

## Also Known As
Wrapper

## Motivation
Let's say that we have a drawing application and it has an interface called the 'Shape' now it can be used by other classes such as 'Circle' and 'Rectangle' but it has compatibility problems regarding the 'Text' class. So, now here comes the question of how we can make the 'Shape' class adaptable by the 'Text' class, so we can do that in the following two ways:
1. Making Interface Implement and Inheriting to the Text Class.
2. Composing 'Text' interface within a 'Text' and Implementing the 'TextShape' in terms of 'Text' class or interface.

## Applicability
Use the Adapter Design Pattern when
* You want to use existing class but its interface does not match the one you needed.
* You want to create a reusable class that corporate with unrelated or unforeseen classes, that is, classes that do not have compatibility issues.
* Object Adapter is required when 
    * Usage of Several Classes is Required.
    * Object Adapt interface of it's parent.