# Mediator

## Notes
__page 622__  
* Use the `Mediator Pattern` to centralize complex communications and control between related objects;  
  
__page 623__  
* __Mediator Benefits__:  
  * Increases the reusability of the objects supported by the Mediator by decoupling them from the system;  
  * Simplifies maintenance of the system by centralizing control logic;  
  * Simplifies and reduces the variety of messages sent between objects in the system;  

* __Mediator Uses and Drawbacks__:  
  * The Mediator is commonly used to coordinate related GUI components;  
  * A drawback of the Mediator pattern is that without proper design, the Mediator object itself can become overly complex.  
  
__Extra__ (from [Refactoring Guru](https://refactoring.guru/design-patterns/mediator))  
* The Mediator pattern is also known as Intermediary, Controller;  
* Mediator lets you reduce chaotic dependencies between objects;  
* The pattern restricts direct communications between objects and forces them to collaborate only via a mediator object;  
* `Facade` and `Mediator`:  
  * Similarities:  
    * Both patterns try to organize collaboration between lots of tightly coupled classes;  
  * Differences:  
    * `Facade` defines a simplified interface to a subsystem, but it doesn't introduce any new functionality;  
	* The subsystem itself is unaware of the facade;  
	* Objects within the subsystem can communicate directly;  
	* `Mediator` centralizes communication between components of the system;  
	* The components only know about the mediator object and don't communicate directly.  