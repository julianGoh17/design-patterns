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
