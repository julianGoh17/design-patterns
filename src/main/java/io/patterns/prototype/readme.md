Prototype Pattern
---

Use the Prototype Pattern when creating an instance of a given class is either expensive or complicated.
The Prototype Pattern allows you to make new instances by copying existing instances.
Prototype should be considered when a system must create new objects of many types in a complex class hierarchy.

Benefits
---

- Hides the complexities of making new instances from the client.
- Provides the option for the client to generate objects whose type is not known.
- In some circumstances, copying an object can be more efficient than creating a new object


Cons:

- A drawback to using the Prototype is that making a copy of an object can sometimes be complicated.