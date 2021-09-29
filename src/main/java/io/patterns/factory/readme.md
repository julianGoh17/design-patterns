Factory Method
---

Comprises of a Creator class and a product class. 
The creator class is responsible for creating (and initializing) the objects that are needed.
Classes that uses the creator don't need to create classes themselves, but instead rely on the factory interface to do so.
Hence, it is easy to change the objects created at run time.

Product class is the abstract type that will be created by the factory.
Thus, it is easy to create a factory that creates different products, but classes using the factory just refer to the abstract class.

The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. 
Factory Method lets a class defer instantiation to subclasses.