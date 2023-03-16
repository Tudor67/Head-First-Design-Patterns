# Factory

## Notes
__page 111__  
If your code is written to an interface, then it will work with any new classes implementing that interface through polymorphism.  

__page 135__  
`Simple Factory`  
- is considered a programming idiom (not design pattern);  
- gives a way to encapsulate object creation;  
- doesn't give the flexibility to vary the products you're creating;  
- relies on object composition (the simple factory is another object that is composed with the Creator (PizzaStore));  
- it decouples the client code from the object creation code in the SimpleFactory class;  

`Factory Method Pattern`  
- is considered a design pattern;  
- gives a way to encapsulate object creation;  
- lets subclass to decide which product to instantiate;  
- it gives the flexibility to vary the products you're creating;  
- relies on inheritance (the factory is a subclass of the Creator (PizzaStore));  
- it decouples the client code in the superclass from the object creation code in the subclass;  

__page 136__  
Advantages of the "factories":  
- by placing all the creation code in one object or method, you can avoid duplication in your code and provide one place to perform maintenance;  
- clients depend only upon interfaces rather than concrete implementations, which makes the code more flexible and extensible in the future;  
- factories encapsulate object creation and lead to more decoupled designs;

__page 162__  
`Abstract Factory Pattern`  
- is considered a design pattern;
- provides an interface for creating families of related or dependent objects (without specifying their concrete classes);
- relies on object composition (object creation is implemented in methods exposed in the factory interface);

`Dependency Inversion Principle`:  
- depend on abstractions;  
- avoid dependencies on concrete types;  
- this principle suggests that both high-level and low-level components/classes should depend on abstractions;  
- factories are a powerful technique for coding to abstractions, not concrete classes;  


## Exercises
__page 163: Crossword Puzzle__  
```
       concretecreator  1
        b             f
    5   j        subclass   4
        e             m
    s   creator   reggiano  7
    i   t             l
    m   concretefactory  8
    p   o              
    l  implementation
    e   p           y
11  factorymethod   s
    a   s           t
    c chicagostyle  y
    t   t           l
    o  pizza     dependent  14
    r   o
    y  encapsulate  15
```