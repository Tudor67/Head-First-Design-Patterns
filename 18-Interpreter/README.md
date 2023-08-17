# Interpreter

## Notes
__page 620__  
* Use the `Interpreter Pattern` to build an interpreter for a language;  
* The Interpreter pattern requires some knowledge of formal grammars;  
  
__page 621__  
* When you need to implement a simple language, the Interpreter pattern defines a class-based representation for its grammar 
along with an interpreter to interpret its sentences;  
* To represent the language, you use a class to represent each rule in the language;  
* To interpret the language, call the "interpret(context)" method on each expression type (it will match the input and evaluate it);  

* __Interpreter Benefits__:  
  * Representing each grammar rule in a class makes the language easy to implement;  
  * Because the grammar is represented by classes, you can easily change or extend the language;  
  * By adding additional methods to the class structure, you can add new behaviors beyond interpretation, like pretty printing and more 
  sophisticated program validation;  

* __Interpreter Uses and Drawbacks__:  
  * Use Interpreter when you need to implement a simple language;  
  * Appropriate when you have a simple grammar and simplicity is more important than efficiency;  
  * Used for scripting and programming languages;  
  * This pattern can become cumbersome when the number of grammar rules is large.  
  In these cases a parser/compiler generator may be more appropriate.  