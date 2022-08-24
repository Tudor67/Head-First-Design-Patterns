# Strategy

## Notes
__page 29__  
`Design patterns` are higher level than libraries.  
`Design patterns` tell us how to structure classes and objects to solve certain problems and it is our job to adapt those designs to fit our particular application.

__page 32__  
`Strategy Pattern` defines a family of algorithms, encapsulates each one, and make them interchangeable.  
`Strategy` lets the algorithm vary independently from clients that use it.

* __OO Basics:__
  - Abstraction
  - Encapsulation
  - Polymorphism
  - Inheritance

* __OO Principles:__
  - Encapsulate what varies
  - Favor composition over inheritance
  - Program to interfaces, not implementations

## Exercises
__page 5: Sharpen your pencil__  
Which of the following are disadvantages of using inheritance to provide Duck behavior? (Choose all that apply.)  
A.) Code is duplicated across subclasses.  
B.) Runtime behavior changes are difficult.  
D.) Hard to gain knowledge of all duck behaviors.  
F.) Changes can unintentionally affect other ducks.  

__page 8: Sharpen your pencil__  
Lots of things can drive change.  
List some reasons you’ve had to change code in your applications (we put in a couple of our own to get you started).
- My company decide that we want new functionalities/features.
- The number of users grows fast. As a result, we need to scale our app.
- Technology changes and we've got to update our code to make use of protocols.

__page 14: Sharpen your pencil__  
1.) Using our new design, what would you do if you needed to add rocket-powered flying to the SimUDuck app?  
I would create a RocketPoweredFlying class that implements the FlyBehaviour interface.  

2.) Can you think of a class that might want to use the Quack behavior that isn’t a duck?  
Maybe a Frog class.  
Maybe a DuckSounds class.  

__page 22:__  
FlyWithWings IMPLEMENTS FlyBehavior  
FlyNoWay IMPLEMENTS FlyBehavior  

Quack IMPLEMENTS QuackBehavior  
Squeak IMPLEMENTS QuackBehavior  
MuteQuack IMPLEMENTS QuackBehavior  

Duck HAS-A FlyBehavior  
Duck HAS-A QuackBehavior  

MallardDuck IS-A Duck  
RedheadDuck IS-A Duck  
RubberDuck IS-A Duck  
DecoyDuck IS-A Duck  

__page 25: Design Puzzle__  
Character has-a WeaponBehavior  
Character contains setWeapon(..)  
Character: abstract class  

Queen extends Character  
King extends Character  
Troll extends Character  
Knight extends Character  

WeaponBehavior: interface  
AxeBehavior implements WeaponBehavior  
BowAndArrowBehavior implements WeaponBehavior  
KnifeBehavior implements WeaponBehavior  
SwordBehavior implements WeaponBehavior  

__page 33: Crossword__  
```
1     
r 3          5   8
encapsulate         2
c o  7      rock    4
u m apis 6   b   f
r p  r       squeak  9
  o  i f m s e   i
designerpatterns l  13
  i  c a r r v   u
  t  i m t a e j r
  i  p e interface  15
  o  l w n e   c s
  n  e o i g   k
   m s r   y   brain  17
   a   k       e
18successes change 19
   i           n
  20  vocabulary
```