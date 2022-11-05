# Introduction
The Interpreter Design Pattern is of class _Behavioral_ and having subclass of _Class Behavioral_. It is related to the representation and usage of the grammar and interpreter.

## Motivation
Sometimes, it becomes a process of usual to check some specific pre-defined grammar for further processing and work and it becomes very difficult to manually handle that kind of definition and checking, so here comes the use of Interpreter Design pattern that provides a good way to represent the grammar and then using Interpreter to interpret sentences in the language.

## Applicability
Use the Interpret Design Pattern when there is a language to interpret, and statements of the langauge can be described in an Abstract Syntax Tree.

Interpreter Design Pattern Works best when:
1. The grammar is simple, as for complex grammars, the class hierarchy for grammar becomes large and unmanageable.
2. Efficieincy is not the critical aspect.