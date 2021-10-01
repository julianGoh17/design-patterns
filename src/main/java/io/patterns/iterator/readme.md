Iterator 
---

The Iterator Pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
Therefore, the class using the iterator doesn't care about how it is implemented, just the items in the iterator.
The iterator makes it easy to modify the code if we need to iterate over a HashMap in the future instead of an array. 