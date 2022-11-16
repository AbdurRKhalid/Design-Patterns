# Introduction
The Visitor Design Pattern is of class _Behavioral_ and having subclass of _Object Behavioral_. Provides functionality to define new operations without changing the class on which new operation has to be performed.

## Motivation
Let's say that we have a compiler, in a compiler there is a requirement or the step of analyzing the Abstract Syntax Tree. During this analysis of the Abstract Syntax tree, there is a need to analyze and create some extra code on that analysis as well. Each compiler has to do these same syntax because the grammar steps remains the same, only thing that changes is the analysis. So, now each leaf of abstract tree is treated as Node, and we need to implement a way where to implement Type checking and further code generation, so this can be implemented by the means of Visitor Design Pattern, as each node will be analyzed differently based on the type of the visitor.

## Structure