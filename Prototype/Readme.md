# Introduction
Prototype is Design Pattern of class *Creational* and having subclass of *Object Creational*. It provides the facility to create copies of the object keeping the copying process same through out.

## Intent
Specifying the kinds of objects to create using a prototype instance, and create new objects by copying this process.

## Motivation
Let's say that we have an editor framework and we want to implement custom music related features for example, adding, deleting and dragging the notes.
Framework provides the 'GraphicTool' class and we want to create custom components for the 'MusicalNotes' class, but there is no direct way to do so except making 'Musical Notes' subclass of 'GraphicalTool'. It creates the problem of subclasses of many. So, Prototype is the Design Pattern that solves this problem.

