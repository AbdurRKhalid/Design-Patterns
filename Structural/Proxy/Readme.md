# Introduction
The Facade Design Pattern is of class *Structural* and having subclass of *Object Structural*. It provides the facility of lazy loading objects on demand.

## Also Known As
**Surrogate**

## Motivation
Let's say that we have a Document Editor and when Document is opened if everything is loaded on the first time including large images, it would take a long time to become usable. So, we have to handle the loading of the images on demand, so that the opening time of the document can be decreased. We can handle this problem by creating an image proxy object that will call _Draw()_ method that will render the images of the document instead of the placeholder image.