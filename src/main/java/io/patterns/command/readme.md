Command Pattern
---

The Command Pattern encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.
This decouples the request from the action being performed, objects don't care about what the command is and will only invoke the execute() function.
We can create a quest of requests that can be executed in parallel by various executors.

If commands are found to be too simple, then we can create Meta Command which is a class that will execute multiple commands.