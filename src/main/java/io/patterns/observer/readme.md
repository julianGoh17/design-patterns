Observer Pattern
---

The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.
Can be a push model (where the observable object will send data to observers) or pull model (where observers ask for data from observable).

### Benefits

- Both Observer and Observable are interfaces 
- We can easily extend Observers by extending code and not changing existing code
- Changes to one interface do not affect the other class as they are loosely coupled.

