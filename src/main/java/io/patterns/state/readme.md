State Pattern
---

The State Pattern allows an object to alter its behavior when its internal state changes. 
The object will appear to change its class.
This pattern works well to abstract a finite state machine into a program. 
 
Effectively, the states themselves implement the same methods, and they control when the machine can move to another state.
The overall machine containing the state classes act as a lower-level element which each state has.
 
