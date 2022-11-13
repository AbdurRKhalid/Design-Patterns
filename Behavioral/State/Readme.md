# Introduction
The State Design Pattern is of class _Behavioral_ and having subclass of _Object Behavioral_. The object appears to change its class as a result chainging the internal strucutre.

## Also Known As
**Objects for States**

## Movtivation
Let's say that we have an implementation of the TCP Class, and the Object of TCP Changes according to occuring changes. Now, in order to handle this sudden change, we have to create a class that is common to all underlying classes. Due to one class being common for others it becomes easy to change the class based on a certain scenario and situation. This is the main idea of the State Design Pattern.

## Structure
![StateDesignPattern](./State%20Design%20Pattern%20Structure.png)
## Applicability
Use State Design Pattern When:
* One Objects behavior depends on its state and it is requirement that the behavior will change on runtime.
* Operations have large, Multipart conditions, that depends upon the object's state.

## Consequences
1. It localize the state specific behavior and partations behavior for different states.
2. It makes the transitions of state explicit.
3. State Objects can be shared.