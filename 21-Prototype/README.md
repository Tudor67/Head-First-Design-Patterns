# Prototype

## Notes
__page 626__  
* Use the `Prototype Pattern` when creating an instance of a given class is either expensive or complicated;  
* The Prototype Pattern allows you to make new instances by copying existing instances;  
* In Java this typically means using `clone()` method, or de-serialization when you need deep copies;  
* A key aspect of this pattern is that the client code can make new instances without knowing which specific class is being instantiated;  
  
__page 627__  
* __Prototype Benefits__:  
  * Hides the complexities of making new instances from the client;  
  * Provides the option for the client to generate objects whose type is not known;  
  * In some circumstances, copying an object can be more efficient than creating a new object;  

* __Prototype Uses and Drawbacks__:  
  * Prototype should be considered when a system must create new objects of many types in a complex class hierarchy;  
  * A drawback to using the Prototype is that making a copy of an object can sometimes be complicated.  
  
__Extra__ (from [Refactoring Guru](https://refactoring.guru/design-patterns/prototype))  
* The Prototype pattern is also known as Clone;  
* Prototype lets you copy existing objects without making your code dependent on their classes;  
* The Prototype pattern delegates the cloning process to the actual objects that are being cloned;  
* The pattern declares a common interface for all objects that supports cloning;  
* This interface lets you clone an object without coupling your code to the class of that object;  
* Usually, such an interface contains just a single clone method;  
* An object that supports cloning is called a prototype.  