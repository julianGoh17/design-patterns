Mediator Pattern
---

With a Mediator added to the system, all of the appliance objects can be greatly simplified:
- They tell the Mediator when their state changes.
- They respond to requests from the Mediator.

Effectively, the mediator acts a bridge which decouples the need for appliances to know about each other.

The Mediator contains all of the control logic for the entire system. 
When an existing appliance needs a new rule, or a new appliance is added to the system, you’ll know that all of the necessary logic will be added to the Mediator.

Benefits:

- Increases the reusability of the objects supported by the Mediator by decoupling them from the system.
- Simplifies maintenance of the system by centralizing control logic.
- Simplifies and reduces the variety of messages sent between objects in the system.

Cons:

- A drawback of the Mediator pattern is that without proper design, the Mediator object itself can become overly complex.