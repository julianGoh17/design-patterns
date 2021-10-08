Bridge
--- 

The Bridge Pattern allows you to vary the implementation, and the abstraction by placing the two in separate class hierarchies.
This is done by having one of the abstractions use the interface (not the concrete method) of another.
This relationship is known as the bridge.

Benefits: 

- Decouples an implementation so that it is not bound permanently to an interface.
- Abstraction and implementation can be extended independently.
- Changes to the concrete abstraction classes don’t affect the client.

Bridge Uses and Drawbacks:

- Useful in graphic and windowing systems that need to run over multiple platforms.
- Useful any time you need to vary an interface and an implementation in different ways.
- Increases complexity