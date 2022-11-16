# Introduction
The Visitor Design Pattern is of class _Behavioral_ and having subclass of _Object Behavioral_. Provides functionality to define new operations without changing the class on which new operation has to be performed.

## Motivation
Let's say that we have a compiler, in a compiler there is a requirement or the step of analyzing the Abstract Syntax Tree. During this analysis of the Abstract Syntax tree, there is a need to analyze and create some extra code on that analysis as well. Each compiler has to do these same syntax because the grammar steps remains the same, only thing that changes is the analysis. So, now each leaf of abstract tree is treated as Node, and we need to implement a way where to implement Type checking and further code generation, so this can be implemented by the means of Visitor Design Pattern, as each node will be analyzed differently based on the type of the visitor.

## Structure

## Applicability
Use Visitor Design Pattern When:
1. The classes that define the structure of the object rarely change, but there is a need to define a new operation over the structure.
2. Many distinct and unrelated options need to be performed on objects in an object structure, and you want to avoid "polluting" their classes with these operations.
3. An Object structure contains many classes of objects with differing interfaces, and you want to perform operations on these objects that depend on their concrete classes.