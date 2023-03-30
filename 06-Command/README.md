# Command

## Notes
__page 196__  
`The Command Pattern` allows you to decouple the requester of an action from the object that actually performs the action.  

__page 214__  
A `Null Object` is useful when you don't have a meaningful object to return, and yet you want to remove the responsibility 
for handling null from the client.  
Sometimes you'll even see Null Object listed as a design pattern.  

__page 230__  
* `The Command Pattern` decouples an object, making a request from the one that knows how to perform it.  
* A Command object is at the center of this decoupling and encapsulates a receiver with an action (or set of actions).  
* An `invoker` makes a request of a Command object by `calling` its `execute()` method, which invokes those actions on the receiver.  
* `Macro Commands` are a simple extension of Command that allow multiple commands to be invoked.  

## Exercises
__page 202: Who Does What?__  
Customer -> Client  
Order -> Command  
takeOrder() -> setCommand()  
Waitress -> Invoker  
Short Order Cook -> Receiver  
orderUp() -> execute()  

__page 207: Brain Power__  
How does the design of the Command Pattern support the decoupling of the invoker of a request 
and the receiver of the request?  

The decoupling is realized with the help of the interfaces and composition.  
The Invoker holds a Command interface (through composition) and at some point asks the Command to carry out a request 
by calling its execute() method.  
The Invoker doesn't know who is the receiver and what request it should perform.  
It only knows that the receiver of the request and the request are encapsulated in the 
Concrete Command object (which implements the Command interface).  

__page 231: Crossword Puzzle__  
```
 2              c
   5            l
 l              invoker  3
binds   w       e
 g e  greeneggsandham  7
 h c    a       t
 t objectville    8
   u    h
   p   vendorclasses  9
 w l r  r         x
 a e e  -         e
 i d c command    c
 t   e  -         undo  14
 receiver  15     t
 e o v  arequest  e
 s o e  m
 s k r  a
```