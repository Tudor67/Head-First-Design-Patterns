# State

## Notes
__page 410__  
* `The State Pattern` allows an object to alter its behavior when its internal state changes. 
The object will appear to change its class.  

__page 411__  
* `The Strategy Pattern`: a flexible alternative to subclassing;  
  * If you use inheritance to define the behavior of a class, then you are stuck with that behavior even if you need to change it;  
  * With `Strategy` you can change the behavior by composing with a different object;  
  * The client usually specifies the strategy object that the context is composed with;  
* `The State Pattern`: an alternative to putting lots of conditionals in your context;  
  * By encapsulating the behaviors within state objects, you can simply change the state object in context to change its behavior;  
  * The client usually knows very little, if anything, about the state objects (that are composed with the context object);  

__page 412__  
* `The State Pattern:`  
  * By encapsulating behaviors into separate state classes, you make states explicit and reduce the effort 
needed to understand and maintain your code.  
  * The client do not interact directly with the states. The context delegates the client request to the state to be handled.  

## Exercises
__page 396: Sharpen your pencil__  
Which of the following describe the state of our implementation?  
Answer:  
(A) This code certainly isn't adhering to the Open Closed Principle.  
(B) This code would make a FORTRAN programmer proud.  
(C) This design isn't even very object oriented.  
(D) State transitions aren't explicit; they are buried in the middle of a bunch of conditional statements.  
(E) We haven't encapsulated anything that varies here.  
(F) Further additions are likely to cause bugs in working code.  

__page 422: Who Does What__  
**Pattern** -> **Description**  
`Strategy` -> Encapsulate interchangeable behaviors and use delegation to decide which behavior to use;  
`State` -> Encapsulate state-based behaviors and delegate behavior to the current state;  
`Template Method` -> Subclasses decide how to implement steps in an algorithm;  