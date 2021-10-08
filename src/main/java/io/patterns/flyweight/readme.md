Flyweight Pattern
---

The Flyweight is used when a class has many instances, and they can all be controlled identically.
It uses a single manager instance which handles the state of all objects.
The objects should be able to processed identically.

Benefits:

- Reduces the number of object instances at runtime, saving memory.
- Centralizes state for many “virtual” objects into a single location

Cons:

- A drawback of the Flyweight pattern is that once you’ve implemented it, single, logical instances of the class will not be able to behave independently from the other instances.
