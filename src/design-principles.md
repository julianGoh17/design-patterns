Design Principles
---

### Program to an interface, not an implementation.
This principle allows our code to be flexible because we are not coding to a concrete implementation.
If the current concrete implementation is not suitable, we can create a new one that extends the same interface and change its behaviour.
We didn't even need to modify the class using the interface!

### Identify the aspects of your application that vary and separate them from what stays the same.
Take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don’t.
This principle will improve code reuse.

