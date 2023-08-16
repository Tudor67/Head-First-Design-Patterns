# Flyweight

## Notes
__page 618__  
* Use the `Flyweight Pattern` when one instance of a class can be used to provide many "virtual instances";  
  
__page 619__  
* __Flyweight Benefits__:  
  * Reduces the number of object instances at runtime, saving memory;  
  * Centralizes state for many "virtual" objects into a single location;  

* __Flyweight Uses and Drawbacks__:  
  * The Flyweight is used when a class has many instances, and they can all be controlled identically;  
  * A drawback of the Flyweight pattern is that once you've implemented it, single, logical instances of the class will not be able to behave 
  independently from the other instances.  
  
__Extra__ (from [Refactoring Guru](https://refactoring.guru/design-patterns/flyweight))  
* The Flyweight pattern is also known as Cache;  
* The Flyweight pattern is useful when the objects we should create contain duplicate states which can be extracted and shared between multiple objects;  
* The fields of the class that will become a Flyweight can be divided into two parts:  
  * the intrinsic state (for flyweight object): the fields that contain unchanging data duplicated across many objects;  
  * the extrinsic state (for contextual object): the fields that contain contextual data unique to each object;  
* We can create a `Factory` class to manage the pool of flyweights.  
It should check for existing flyweight before creating a new one;  
* Differences between `Flyweight` and `Singleton`:  
  * There should be only one Singleton instance, whereas a Flyweight class can have multiple instances with different intrinsic states;  
  * The Singleton object can be mutable. Flyweight objects are immutable.  