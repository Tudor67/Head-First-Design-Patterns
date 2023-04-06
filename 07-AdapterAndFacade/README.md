# Adapter and Facade

## Notes
__page 243__  
* `The Adapter Pattern` converts the interface of a class into another interface the clients expect;  
* The conversion is achieved by wrapping the object that has an incompatible interface with an object that implements the correct one;  
* `Adapter` lets classes work together that couldn't otherwise because of incompatible interfaces;  
* The Adapter encapsulates the change of the Adaptee so that the Client doesn't have to be modified each time 
 it needs to operate against a different interface;  
* `Object Adapter`:  
  - `Client` -> `request()` -> `Adapter` (implements target interface and holds an instance of the Adaptee) ->
  `translatedRequest()` -> `Adaptee` (implements Adaptee interface);  
  - The Client and Adaptee are decoupled - neither knows about the other;  

__page 244__  
* There are two kinds of adapters: `object adapters` and `class adapters`;  
* With `object adapter`:  
  - we use object composition to wrap the Adaptee with an altered interface;  
    - we can use an Adapter with any subclass of the Adaptee (flexible design);  
  - we can wrap more than one Adaptee in a single Adapter;  
  - we first instantiate the Adaptee object and use it later in many different Adapter objects;  
* With `class adapter`:  
  - we use multiple inheritance to subclass the Target and the Adaptee;  
    - the Adapter is committed to one specific Adaptee class (which is not a flexible design);  
	- the behavior of the Adaptee can be overridden by subclassing (without reimplementing the entire adaptee);  
  - we have to specify all the parameters for the Adaptee and Adapter constructors when we instantiate the Adapter;  
    - the Adaptee and Adapter data is initialized together;  
	- there is just one object (in the case of class adapter),
	not a separate adapter instance and a separate adaptee instance;  

__page 260__  
* `Facade Pattern`:  
  - provides a simplified interface to a subsystem;  
  - it still exposes the full functionality of the system to those who may need it;  
  - decouples a client from a subsystem of components;  
  
__page 265__  
`Principle of Least Knowledge`: talk only to your immediate friends.  

`Why?` Because when you build a lot of dependencies between many classes,
you are building a fragile system that will be costly to maintain and complex 
for others to understand.  

`How?` Take any object; now from any method in that object we should only invoke methods that belong to:  
* The object itself;  
* Objects passed in as a parameter to the method;  
* Any object the method creates or instantiates;  
* Any components of the objects;  
The above guidelines tell us not to call methods on objects that were returned from calling other methods.  

## Exercises
__page 254: Who Does What?__  
**Pattern** -> **Intent**  
`Decorator` -> Doesn't alter the interface, but adds responsibility;  
`Adapter` -> Converts one interface to another;  
`Facade` -> Makes an interface simpler;  

__page 271: Crossword Puzzle__  
```
            false
          d    i
    l converts m
    e     c    p
6  raidersofthelostark
    s e   u u  e
    t c   p r  p       p
    k o   l k  acadapter  10
    n r   i e  s       i
  twoway  n y  s       n
    w t   g    t p  t  t
   allows      h o  a fly  15
    e r       wrappers n
facade  w      o c  g
    g   r      u o  e
 hometheater   g r  t
        p      h n
```