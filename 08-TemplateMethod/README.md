# Template Method

## Notes
__page 286__  
* `The Template Method`:  
  - defines the steps of an algorithm and  
  - allows subclasses to provide the implementation for one or more steps;  
  - provides a fundamental method for code reuse that allows subclasses to specify behavior;  
  
* Details:  
  - the template method is defined in the abstract class;  
  - and it is final (it cannot be overridden by any subclasses) because the algorithm inside the template is fixed;  
  - only the steps of the algorithm can be overridden by subclasses;  
  - for optional steps we can use hook methods (methods defined in the abstract class, with empty or default implementations);  
  - hook methods can be overridden by subclasses;  

__page 292__  
* A `hook` is a method that is declared in the abstract class, but only given an empty or default implementation.  
* With a hook, we can override the method, or not. It's our choice. If we don't, the abstract class provides a default implementation.  
* We use hooks when that part/step of the algorithm is optional.  

__page 296__  
* `The Hollywood Principle`: Don't call us, we'll call you.  
* The Hollywood Principle is a technique for building frameworks so that:  
  - lower-level components can be hooked into the computation,  
  - but without creating dependencies between the lower-level components and the higher-level layers;  
  - the high-level components determine when low-level components are needed, and how;  
* Patterns that make use of the Hollywood Principle: Template Method, Factory Method, Observer;  
  
* Both Dependency Inversion Principle and Hollywood Principle have the goal of decoupling;  
* Dependency Inversion Principle makes a much stronger and general statement about how to avoid dependencies in design:  
  - both high-level and low-level components should depend on abstractions;  

__page 311__  
* `The Template Method` encapsulates algorithms with inheritance (benefit: code reusal);  
* `Strategy` encapsulates algorithms with composition (benefit: flexibility + possibility of changing the algorithms at runtime);  
* `The Factory Method` can be seen as a specialization of Template Method Pattern;  

## Exercises
__page 298: Who Does What?__  
**Pattern** -> **Description**  
`Strategy` -> Encapsulate interchangeable behaviors and use delegation to decide which behavior to use;  
`Factory Method` -> Subclasses decide which concrete classes to create;  
`Template Method` -> Subclasses decide how to implement steps in an algorithm;  

__page 305: Brain Power__  
We know that we should favor composition over inheritance, right? Well, the implementers of the 
sort() template method decided not to use inheritance and instead to implement sort() as a static 
method that is composed with a Comparable at runtime. How is this better? How is it worse? How 
would you approach this problem? Do Java arrays make this particularly tricky?  
First of all, we cannot subclass a Java array.  
Using composition over the inheritance seems a good solution for that problem.  
More than that, we can use the same sorting template method for different array data types/classes by simply 
forcing the data type/class to provide the missing implementation of the compareTo() method.  

Think of another pattern that is a specialization of the template method. In this specialization, primitive 
operations are used to create and return objects. What pattern is this?  
Factory Method.  

__page 310: Crossword Puzzle__  
```
 composition
  p   p
  t  mergesort
paint c
  o   inheritance  a
  n   a            b
tea hollywood      s
w l o i            t
o   o z     s      r
  s k algorithm    a
  t   t     r      c
 caffeine   abstract
  r   o     t t
  b   n     e applet
  u         g t
  z         y i
  z           c
```