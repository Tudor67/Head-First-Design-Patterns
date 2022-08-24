# Observer

## Notes
__page 51__  
`The Observer Pattern` defines a one-to-many dependency/relationship between objects so that when one object (the subject) changes state, all of its dependents (observers) are notified and updated automatically.

__page 52__  
The subject is the sole owner of the data and the observers are dependent on the subject to update them when data changes.  
This leads to a cleaner OO design than allowing many objects to control the same data.

__page 53__  
The Observer Pattern provides an object design where subjects and observers are loosely coupled.  
Subjects and observers can interact even if they have very little knowledge of each other.  
Changes to either the subject or an observer will not affect the other.  
We never need to modify the subject to add new types of observers.

## Exercises
__page 42: Sharpen your pencil__  
Based on our first implementation, which of the following apply?  
A. We are coding to concrete implementations, not interfaces.  
B. For every new display element we need to alter code.  
C. We have no way to add (or remove) display elements at run time.  
E. We haven’t encapsulated the part that changes.

__page 75: Exercise__  
__Design Principle Challenge__  
For each design principle, describe how the Observer Pattern makes use of the principle.  

`1. Identify the aspects of your application that vary and separate them from what stays the same.`  
Book:  
The thing that varies in the Observer Pattern is the state of the Subject and the number and types of Observers.  
With this pattern, you can vary the objects that are dependent on the state of the subject, without having to change that Subject.

`2. Program to an interface, not an implementation.`  
My answer:  
The subject interacts with observers, but it has very little knowledge about them.  
It only knows that the observers implement the interface Observer (which contains the method update()).  
The subject notifies the observers by simply calling the method update() (which is implemented by all observers).

Book:  
Both the Subject and Observer use interfaces.  
The subject keeps track of objects implementing the Observer interface,  
while the observers register with, and get notified by, the Subject interface.  
This keeps things nice and loosely coupled.  

`3. Favor composition over inheritance.`  
My answer:  
The subject stores the references of all observers (which implement the interface Observer).  
To notify them, it simply calls the update() method of each observer.  
Each observer stores the reference of the subject.  
An observer can register to the subject, but it can also unsubscribe from the subject. 

Book:  
The Observer Pattern uses composition to compose any number of Observers with their Subjects.  
These relationships are set up at runtime by composition.

__page 76: Crossword Puzzle__  
```
        2      3
    class  1   listening  3
        update o
      job      observer  6
    d 9 j      s
   removeobserver  s
 h  v b c          w
 u  i setchanged i i
 r  l e     o    many  15
 r  l r     t    p g
 i  i v     i m  l
 c  s a h   f order  18
 a  t b e   i u  m
 n  e l a pressure   19
dependent u d e  n
    e     s      t
interface h publisher  22
```