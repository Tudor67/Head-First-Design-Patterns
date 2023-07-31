# Better Living with Patterns

## Notes
__page 579__  
* A `Design Pattern` gives you a solution to a common recurring design problem;  

__page 581__  
* `Pattern Catalogs` describe:  
  * the pattern's intent and motivation;  
  * where it might apply;  
  * the solution design;  
  * the consequences (good and bad) of using it;  
  
__page 590__  
* Design patterns can be partitioned into three categories (based on their purposes):  
* `Creational`: involve object instantiation and all provide a way to decouple a client from the objects it needs to instantiate.  
  * Singleton  
  * Factory Method  
  * Abstract Factory  
  * Builder  
  * Prototype  
* `Behavioral`: concerned with how classes and objects interact and distribute responsibility.  
  * Strategy  
  * State  
  * Command  
  * Observer  
  * Iterator  
  * Template Method  
  * Mediator  
  * Visitor  
  * Memento  
  * Interpreter  
  * Chain of Responsibility  
* `Structural`: let you compose classes or objects into larger structures.  
  * Adapter  
  * Facade  
  * Composite  
  * Proxy  
  * Decorator  
  * Bridge  
  * Flyweight  
  
__page 591__  
* Patterns are often classified by a second attribute: whether or not the pattern deals with classes or objects:  
* `Class Patterns`:  
  * describe how relationships between `classes` are defined via `inheritance`;  
  * relationships in class patterns are established at `compile time`;  
  * examples: Template Method, Factory Method, Adapter, Interpreter.  
* `Object Patterns`:  
  * describe relationships between `objects` and are primarily defined by `composition`;  
  * relationships in object patterns are typically created at `runtime` and are more dynamic and flexible;  
  * examples: Singleton, Observer, Decorator, Strategy, Command, etc.  
  
__page 606__  
* An `Anti-Pattern` tells you how to go from a problem to a bad solution;  
* Avoiding bad solution can be just as valuable as finding good ones;  
* One of the biggest jobs of the anti-pattern is to alert you to the seductive aspect of the solution;  

__page 608__  
* Build your team's `shared vocabulary`. This is one of the most powerful `benefits of using patterns`.  
* Use a pattern when you expect aspects of your system to vary.  
* Avoid patterns when you have a simple solution that meets your needs.  

## Exercises
__page 588: Who Does What__  
**Pattern** -> **Description**  
`Decorator` -> Wraps an object to provide new behavior.  
`State` -> Encapsulates state-based behaviors and uses delegation to switch between behaviors.  
`Iterator` -> Provides a way to traverse a collection of objects without exposing its implementation.  
`Facade` -> Simplifies the interface of a set of classes.  
`Strategy` -> Encapsulates interchangeable behaviors and uses delegation to decide which one to use.  
`Proxy` -> Wraps an object to control access to it.  
`Factory Method` -> Subclasses decide which concrete classes to create.  
`Adapter` -> Wraps an object and provides a different interface to it.  
`Observer` -> Allows objects to be notified when state changes.  
`Template Method` -> Subclasses decide how to implement steps in an algorithm.  
`Composite` -> Clients treat collections of objects and individual objects uniformly.  
`Singleton` -> Ensures one and only one object is created.  
`Abstract Factory` -> Allows a client to create families of objects without specifying their concrete classes.  
`Command` -> Encapsulates a request as an object.  