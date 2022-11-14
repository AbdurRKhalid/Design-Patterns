# Introduction
The Strategy Design Pattern is of class _Behavioral_ and having subclass of _Object Behavioral_. It is related to defining the algorithms that can be interchangeable and also it does not depends upon the client that is using each algorithm.

## Also Known As
**Policy**

## Motivation
Let's say that we have an implementation of the String Building and different types of strings have different kind of building. Now let's say that we have to implement the line breaking algorithm. Now, it becomes very difficult to hard wiring implementation of the line breaking for different kind of String Building methods, the simple way to implement this is through Strategy Design Pattern. In this pattern, a class is defined that encapsulates different line breaking algorithms.