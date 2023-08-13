# Chain of Responsibility

## Notes
__page 616__  
* Use the `Chain of Responsibility Pattern` when you want to give more than one object a chance to handle a request;  
* `Chain of Responsibility` lets you pass requests along a chain of handlers;  
* Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain;  
* `Chain of Responsibility` and `Decorator`:
  * Similarities:  
    * Both patterns rely on recursive composition to pass the execution through a series of objects;  
  * Differences:  
    * `Chain of Responsibility` handlers can execute arbitrary operations independently of each other;  
    * `Chain of Responsibility` handlers can stop passing the request further at any point;  
	* `Decorators` can extend the object's behavior while keeping it consistent with the base interface;  
	* `Decorators` aren't allowed to break the flow of the request;  
	
__page 617__  
* __Chain of Responsibility Benefits__:  
  * Decouples the sender of the request and its receivers;  
  * Simplifies your object because it doesn't have to know the chain's structure and keep direct references to its members;  
  * Allows you to add or remove responsibilities dynamically by changing the members or order of the chain;  

* __Chain of Responsibility Uses and Drawbacks__:  
  * Commonly used in windows systems to handle events like mouse clicks and keyboard events;  
  * Execution of the request isn't guaranteed; it may fall off the end of the chain if no object handles it (this can be an advantage or a disadvantage);  
  * Can be hard to observe the runtime characteristics and debug.  