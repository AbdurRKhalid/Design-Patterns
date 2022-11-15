# Introduction
The Template Method Design Pattern is of class _Behavioral_ and having subclass of _Class Behavioral_. Provides the functionality to change some steps of the algorithms in the subclassing, making the implementation of the a certain algorithm flexible in terms of the subclassing.

## Motivation
Let's say that we have an document reading and writing application, and this application has the classes of "Application" and "Document". Application calss open the documents that are saved on the disks, and the Document class provides the methods to read the recently read documents. Now, let's say that we have the Excel reading document, so it will require a slighlty different implementation of the documents reading method to read the Excel file, and same thing goes to the drawing files as well. This provides the scenario to slioghtly vary the already implemented algorithms or methods based on the different situation, and here also comes the implementation of Template Method design pattern.

## Strucutre

## Applicability
Use Template Method Design Pattern When:
1. To implement the invariant parts of an algorithm once and leave it up to subclasses to implement the behavior that can vary.
2. when common behavior among subclasses should be factored and localized in a common class to avoid code duplication.
3. To Control Subclasses extensions.