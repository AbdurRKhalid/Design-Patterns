# Introduction
The Decorator Design Pattern is class of *Structural* and having subclass of *Object Structural*. It helps to add additional functionality to object on the run-time.

## Intent
* Attaching Additional Responsibilities to an Object Dynamically.
* An Alternate to Subclasses for extending Functionalities.

## Motivation
Sometimes we need to add some additional functionality at runtime, so it requires the implementation of Decorator Design Pattern.
Let's say that we have a Text Viewer and we want to add a Border, Horizontal and Vertical Scroll. So, these cannot be added directly to the Text Viewer Object, this is a solid example of application of the Decorator Design Pattern.

## Also Known As
**Wrapper**

## Structure
![DecoratorDesignPatter](./Decorator%20Design%20Pattern.png)
## Applicability
Use Decorator Design Pattern when:
1. Adding responsibilities to object transparently and dynamically without affecting other objects.
2. For responsibilities that can be withdrawn.
3. When extension of class is not possible.

## Consequences
* More flexible than static inheritance.
* Avoids feature-laden classes high-up in Hierarchy.
* A Decorator and its components are not identical.