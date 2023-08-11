# Builder

## Notes
__page 614__  
* Use the `Builder Pattern` to encapsulate the construction of a product and allow it to be constructed in steps;  

__page 615__  
* __Builder Benefits__:  
  * Encapsulate the way a complex object is constructed;  
  * Allows objects to be constructed in a multi-step and varying process (as opposed to one step factory);  
  * Hides the internal representation of the product from the client;  
  * Product implementations can be swapped in and out because the client only sees an abstract interface;  

* __Builder Uses and Drawbacks__:  
  * Often used for building composite structures;  
  * Constructing objects requires more domain knowledge of the client than when using a Factory.  