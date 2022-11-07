# Introduction

The Interpreter Design Pattern is of class _Behavioral_ and having subclass of _Object Behavioral_. It promotes the loose coupling of the objects so that behaviour can become independent.

## Motivation

Object Orineted Design Promtes the distribution of behavior among objects. Such distribution can result in objects knowing each other, and in the worst case scenario every object can end up knowing each other.

An example can be consider, where aa dialog boxes in a GUI. A dialog box uses a window to present a collection of widgets such as buttons and dropdowns etc. There can exists certain dependencies such as button will only display when the input field is not empty. Now, such dependencies can occurr between many widgets, so not it becomes very difficult to customize each widget. Now, this problem can be avoided using the **Mediator** design pattern. A Mediator is responsible for the controlling and coordinating the interaction of the group of objects. It also prevents the group of widgets refering to each other.

## Structure

![MediatorDesignPatter](./Mediator%20Design%20Pattern.png)

## Applicability

Use the Mediator Design Pattern when

1. A Set of Objects Communicate in Well-Defined but complex ways.
2. Reusing Object is difficult because it refers to and communicates with many other objects.
3. A Behaviour that is distributed between several calsses should be customizable without a lot of subclassing.

## Consequences

- It Limits the Subclassing.
- It Decouples Colleagues.
- It simplifies object protocols.
- It abstracts how objects cooperate.
- It centralizes control.
