# Visitor

## Notes
__page 628__  
* Use the `Visitor Pattern` when you want to add capabilities to a composite of objects and encapsulation is not important;  
  
__page 629__  
* __Visitor Benefits__:  
  * Allows you to add operations to a Composite structure without changing the structure itself;  
  * Adding new operations is relatively easy;  
  * The code for operations performed by the Visitor is centralized;  

* __Visitor Drawbacks__:  
  * The Composite classes' encapsulation is broken when the Visitor is used;  
  * Because the traversal function is involved, changes to the Composite structure are more difficult.  
  
__Extra__ (from [Refactoring Guru](https://refactoring.guru/design-patterns/visitor))  
* Visitor lets you separate algorithms from the objects on which they operate;  
* You can treat Visitor as a powerful version of the Command pattern;  
* Its objects can execute operations over various objects of different classes.  