# Introduction
The Strategy Design Pattern is of class _Behavioral_ and having subclass of _Object Behavioral_. It is related to defining the algorithms that can be interchangeable and also it does not depends upon the client that is using each algorithm.

## Also Known As
**Policy**

## Motivation
Let's say that we have an implementation of the String Building and different types of strings have different kind of building. Now let's say that we have to implement the line breaking algorithm. Now, it becomes very difficult to hard wiring implementation of the line breaking for different kind of String Building methods, the simple way to implement this is through Strategy Design Pattern. In this pattern, a class is defined that encapsulates different line breaking algorithms.

## Structure
![StrategyDesignPattern](./Strategy%20Design%20Pattern.png)
## Applicability
Use Strategy Design Pattern when:
1. Many Related Classes Differ in only their Behavior. Strategy provides a way to configure a class with one of many behaviors.
2. Different Variants of an Algorithm is required.
3. An Algorithm uses data that client should not known about.
4. A Class defines many behaviors, and these appear as multiple conditional statements in its operations.

## Consequences
* Implementation of Families of Related Algorithms can become easy.
* It is a better alternative to subclassing.
* Strategy Design Pattern eliminates the complex conditional statements.