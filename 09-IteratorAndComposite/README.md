# Iterator and Composite

## Notes
__page 325__  
* `Collections` <=> `Aggregates` <=> Group of objects;  

__page 336__  
* `The Iterator Pattern` allows traversal of the elements of an aggregate without exposing the underlying implementation;  
* It also places the task of traversal on the iterator object, not on the aggregate, which:  
  * simplifies the aggregate interface and implementation (aggregates manage a collection of objects);  
  * places the responsibility where it should be (iterators focus on iteration);  
  
__page 339__  
* `The Single Responsibility Principle:` A class should have only one reason to change.  
* Every responsibility of a class is an area of potential change. More than one responsibility means more than one area of change.  
* This principle guides us to keep each class to a single responsibility.  
* Why? Many areas of change => many modifications of the class => many opportunities for problems to creep in.  

__page 356__  
* `The Composite Pattern:` compose objects into tree structure to represent part-whole relationships;  
* Composite lets clients treat individual objects and compositions of objects uniformly;  

__page 357__  
* `The Composite Pattern` allows us to build structures of objects in the form of trees that contain both compositions of objects 
and individual objects as nodes;  
* Using a composite structure, we can apply the same operations over both composites and individual objects;  
In other words, in most cases we can ignore the differences between compositions of objects and individual objects;  

__page 376__  
* The Composite Pattern should be used when we have collections of objects with whole-part relationships, 
and we want to be able to treat those objects uniformly.  

__page 377__  
* The greatest strength of the Composite Pattern: it simplifies the life of its clients.  
* How?  
  * Clients don't have to worry about whether they're dealing with a composite object or a leaf object, 
  so they don't have to write if statements everywhere to make sure they're calling the right methods on the right objects;  
  * Clients can make one method call and execute an operation over an entire structure;  

## Exercises
__page 322: Sharpen your pencil__  
Based on our implementation of printMenu(), which of the following apply?  
Answer:  
* (A) We are coding to the PancakeHouseMenu and DinerMenu concrete implementations, not to an interface.  
* (C) If we decided to switch from using DinerMenu to another type of menu that implemented its list of menu items 
with a Hashtable, we’d have to modify a lot of code in the Waitress.  
* (D) The Waitress needs to know how each menu represents its internal collection of menu items;  
this violates encapsulation.  
* (E) We have duplicate code: the printMenu() method needs two separate loops to iterate over the two different kinds of 
menus. And if we added a third menu, we’d have yet another loop.  

__page 340: Brain Power__  
`Multiple Responsibilities:` Game, Person, DeckOfCards, ShoppingCart  

__page 340: Brain Power__  
`Low Cohesion:` Game  
`High Cohesion:` GameSession, PlayerActions, Player  

__page 350: Code Magnets__  
```java
import java.util.Iterator;
import java.util.Calendar;

public class AlternatingDinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
    }
    
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
    
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 2;
        return menuItem;
    }
    
    public void remove() {
        throw new UnsupportedOperationException(
            "Alternating Diner Menu Iterator does not support remove()");
    }
}
```

__page 379: Who Does What?__  
**Pattern** -> **Description**  
`Strategy` -> Encapsulates interchangeable behaviors and uses delegation to decide which one to use;  
`Observer` -> Allows a group of objects to be notified when some state changes;  
`Adapter` -> Changes the interface of one or more classes;  
`Facade` -> Simplifies the interface of a group of classes;  
`Iterator` -> Provides a way to traverse a collection of objects without exposing the collection's implementation;  
`Composite` -> Clients treat collections of objects and individual objects uniformly;  

__page 378: Crossword Puzzle__  
```
composite       w
o              java.util
m iteration     i r
p m            iterator
o p   f    l    r a   e
n l  pancakehouse y   c
e e   c    a    s l   u
n m c t leaf    s i   r
t e o o           s   s
singleresponsibility  i
  t l y               o
 cafe m            change
  t c e
  i t t
  o i hashtable
  n o o
    n dessert
```