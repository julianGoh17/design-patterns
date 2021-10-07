Chain of Responsibility
---

With the Chain of Responsibility Pattern, you create a chain of objects that examine a request. 
Each object in turn examines the request and handles it, or passes it on to the next object in the chain.

Benefits:

- Decouples the sender of the request and its receivers.
- Simplifies your object because it doesn’t have to know the chain’s structure and keep direct references to its members.
- Allows you to add or remove responsibilities dynamically by changing the members or order of the chain.

Cons:

- Execution of the request isn’t guaranteed; it may fall off the end of the chain if no object handles it (this can be an advantage or a disadvantage).
- Can be hard to observe the runtime characteristics and debug.