Visitor Pattern
---

The Visitor must visit each element of the Composite; that functionality is in a Traverser object.
The Visitor is guided by the Traverser to gather state from all of the objects in the Composite.
Once state has been gathered, the Client can have the Visitor perform various operations on the state. 
When new functionality is required, only the Visitor must be enhanced.


Benefits:
- Allows you to add operations to a Composite structure without changing the structure itself.
- Adding new operations is relatively easy.
- The code for operations performed by the Visitor is centralized.

Cons:
- The Composite classes’ encapsulation is broken when the Visitor is used.
- Because the traversal function is involved, changes to the Composite structure are more difficult.