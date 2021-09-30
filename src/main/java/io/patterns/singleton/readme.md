Singleton
---

The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.
This pattern achieves this by letting a class manage a single instance of itself. 
We’re also preventing any other class from creating a new instance on its own. 
To get an instance, you’ve got to go through the class itself. 

### Useful For

Ensuring there is only ONE instance of a single class such as a Thread Pool Manager.

### Note

We may need to synchronize access to creating the instance if multi-threading. 
There are a few ways to achieve this:

1. Create a single instance of class on start up. Though this may not be good on classes that are not always required.
2. Synchronize the method, but this comes at the cost of runtime performance.
3. Synchronize only the instantiating of the object.
