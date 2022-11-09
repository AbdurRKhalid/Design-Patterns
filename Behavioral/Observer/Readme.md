# Introduction
The Observer Design Pattern is of class _Behavioral_ and having subclass of _Object Behavioral_. It provides an effective functionality for one to many relationship between object to automatically upadte if one object changes.

## Also Known As
**Dependents** and **Publish-Subscribe**

## Motivation
Let's say that we have an application that reports some basic numbers to the dashboard, and those numbers came from different components of the application. Now, here is a very interesting problem, let's say that one interface changes the one number, how we can identify the other classes that something has been changed in once interface so that it can get the most updated value. Here, comes the use of the Observer design pattern. We have **Subject** and **Observer** in this design pattern, where subject publishes the update and the **Subject** notifies the other objects to update their current values.

## Structure

## Applicability
Use Observer Design Pattern when:
1. When an abstraction has two aspects, one dependent is on other.
2. When change to one object requires change in others too, and there is not a way to know how many objects will get changed.
3. When an object has to notify others without making any assumptions.