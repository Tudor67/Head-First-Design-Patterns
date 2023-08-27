# Memento

## Notes
__page 624__  
* Use the `Memento Pattern` when you need to be able to return an object to one of its previous states; for instance, if your user requests an "undo";  
  
__page 625__  
* The Memento has two goals:  
  * Saving the important state of a system's key object;  
  * Maintaining the key object's encapsulation;  
* Keeping the `Single Responsibility Principle` in mind, it's also a good idea to keep the state that you're saving separate from the key object. 
This separate object that holds the state is known as the `Memento object`.  
  
* __Memento Benefits__:  
  * Keeping the saved state external from the key object helps to maintain cohesion;  
  * Keeps the key object's data encapsulated;  
  * Provides easy-to-implement recovery capability;  

* __Memento Uses and Drawbacks__:  
  * The Memento is used to save a state;  
  * A drawback to using Memento is that saving and restoring state can be time consuming;  
  * In Java systems, consider using Serialization to save a system's state;  
  
__Extra__ (from [Refactoring Guru](https://refactoring.guru/design-patterns/memento))  
* The Memento pattern is also known as Snapshot;  
* Memento lets you save and restore the previous state of an object without revealing the details of its implementation;  
* The Memento pattern delegates creating the state snapshots to the actual owner of that state, the originator object;  
* The contents of the memento object aren't accessible to any object except the one that produced it (the originator object);  
* Other objects must communicate with memento objects using a limited interface which may allow fetching the snapshot's metadata (creating time, the name of the operation, etc.);  
* It's a common practice to make the memento immutable and pass it the data only once, via the constructor.  