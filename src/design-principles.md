Design Principles
---

### Program to an interface, not an implementation.
This principle allows our code to be flexible because we are not coding to a concrete implementation.
If the current concrete implementation is not suitable, we can create a new one that extends the same interface and change its behaviour.
We didn't even need to modify the class using the interface!

### Identify the aspects of your application that vary and separate them from what stays the same.
Take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don’t.
This principle will improve code reuse.

### Favor composition over inheritance.
Creating systems using composition gives you a lot more flexibility. 
Not only does it let you encapsulate a family of algorithms into their own set of classes, but it also lets you change behavior at runtime as long as the object you’re composing with implements the correct behavior interface.

### Strive for loosely coupled designs between objects that interact.
Loosely coupled designs allow us to build flexible OO systems that can handle change because they minimize the interdependency between objects.


### Classes should be open for extension, but closed for modification.

We should be able to extend the code base without modifying existing classes. 
Creates a design that are resilient to change and flexible enough to take on new functionality to meet changing requirements.
By not changing existing code, we don't risk creating buggy code.

### Dependency Inversion Principle

Depend upon abstractions. Do not depend upon concrete classes.
It suggests that our high-level components should not depend on our low-level components; rather, they should both depend on abstractions.
For example, the High-level pizza store doesn't care about what pizza it uses, just that it uses a pizza.
The inversion means that low-level components depend on higher level abstractions. 
For example, a Normal pizza depends on the Pizza abstraction.

Avoid: 

- No variable should hold a reference to a concrete class.
- No class should derive from a concrete class.
- No method should override an implemented method of any of its base classes.

### Principle of Least Knowledge

Only talk to your immediate friends.
This principle helps to reduce the number of class interactions.
It prevents us from creating a large number of classes that are coupled together such that changes to one part of the system cascades into another.

According to this principle, an object should only invoke methods if it belongs to:

- The object itself
- Objects passed in as a parameter of the method
- Any object the method creates or instantiates
- Any components of the object

### Hollywood Principle

Don’t call us, we’ll call you.
Effectively, this principle gives us a way to prevent dependency rot.
Dependency rot occurs when you have high-level components depending on low-level components depending on high-level components depending on sideways components depending on low-level components, and so on.
When the rot sets in, no one understands who calls what.

The principle allows low level components to hook themselves into the system, but high-level components determine when these components are needed and how.

**Hook:** A hook is a method that is declared in the abstract class, but only given an empty or default implementation.
Thus, sub-classes have the ability to "hook-into" the algorithm to implement custom behaviour or ignore the hook if needed.
