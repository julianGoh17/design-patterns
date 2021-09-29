Strategy Pattern
--

The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. 
Strategy lets the algorithm vary independently from clients that use it.

How it works
--

Define an Abstract class, which has behaviours (interfaces) as private variables. 
Anything that is a subclass of the abstract class will initialize the behaviours using the subclasses of the interface.
This pattern allows us to dynamically update behaviour at run-time because we are using an interface.