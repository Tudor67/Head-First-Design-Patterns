# Bridge

## Notes
__page 612__  
* Use the `Bridge Pattern` to vary not only your implementations, but also your abstractions;  

__page 613__  
* The `Bridge Pattern` allows you to vary the implementation and the abstraction by placing the two in separate class hierarchies;  
* The relationship (HAS-A) between the `abstraction class hierarchy` and the `implementation class hierarchy` is referred to as the `bridge`;  
* __Bridge Benefits__:  
  * Decouples an implementation so that it is not bound permanently to an interface;  
  * Abstraction and implementation can be extended independently;  
  * Changes to the concrete abstraction classes don't affect the client;  
* __Bridge Uses and Drawbacks__:  
  * Useful in graphic and windowing systems that need to run over multiple platforms;  
  * Useful any time you need to vary an interface and an implementation in different ways;  
  * Increases complexity.  