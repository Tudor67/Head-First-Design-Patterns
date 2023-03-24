# Singleton

## Notes
__page 186__  
- `Singleton:` ensure a class only has one instance and provide a global point of access to it.  

- Java's implementation of the Singleton Pattern makes use of:  
  * a private constructor;  
  * a static method combined with a static variable;  
  
- Two techniques for instantiation a unique object:  
  * `Lazy instantiation` (the object is instantiated lazily when the static method getInstance() is called);  
  * `Eager instantiation` (the object is instantiated eagerly when we declare and initialize the static variable uniqueInstance);  

- Possible `problems` when implementing a Singleton:  
  * `Multithreading` (multiple threads can create more than one instance of our Singleton);  
    - Solution 1: synchronize the getInstance() method to force every thread to wait its turn before it can enter the method;  
	              synchronization is expensive;  
    - Solution 2: use double-checked locking to speed up the synchronization solution;  
	              we need to mark with volatile the uniqueInstance variable and put the initialization code in a synchronized block;  
    - Solution 3: create an instance of Singleton in a static initializer;  
  * `Multiple Class Loaders` (using multiple class loaders can defeat the Singleton implementation and result in multiple instances);  
    - Solution 1: specify the class loader by yourself;  
	
## Exercises
__page 179: Be the JVM__  
Threads are a problem:  
```
            Thread 1                                  Thread 2                  Value of uniqueInstance  
----------------------------------------------------------------------------------------------------------  
    public static ChocolateBoiler                                          
           getInstance() {                                                                 null
----------------------------------------------------------------------------------------------------------  
                                            public static ChocolateBoiler
                                                   getInstance() {                         null
----------------------------------------------------------------------------------------------------------  
    if (uniqueInstance == null) {                                                          null
----------------------------------------------------------------------------------------------------------  
                                            if (uniqueInstance == null) {                  null
----------------------------------------------------------------------------------------------------------  
       uniqueInstance = new ChocolateBoiler();                                           <Object 1>
    }  
    return uniqueInstance;                                                               <Object 1>
    }
----------------------------------------------------------------------------------------------------------  
                                               uniqueInstance = new ChocolateBoiler();   <Object 2>
                                            }  
                                            return uniqueInstance;                       <Object 2>
                                            }  
----------------------------------------------------------------------------------------------------------  
```

__page 183: Sharpen your pencil__  
Fixing the ChocolateBoiler code (with multithreading problems).  

`Solution 1 (Lazy instantiation):` Synchronize the getInstance() method  
- A straightforward technique that is guaranteed to work;  
- We don't seem to have any performance concerns with the chocolate boiler, so this would be a good choice;  

`Solution 2 (Lazy instantiation):` Double-checked locking  
- Given we have no performance concerns, double-checked locking seems like overkill;  
- In addition, we'd have to ensure that we are running at least Java 5;  

`Solution 3 (Eager instantiation):` Eager instantiation  
- We are always going to instantiate the chocolate boiler in our code, so statically initializing the instance would cause no concerns;  

__page 187: Crossword Puzzle__  
```
car       milk
l   s    g t
a c t  m a s  boiler  8
s o a  u r e    n
s n t globalaccesspoint  10
l s i  t a f  l t
o t c  i g    a a
a r a  t e    s n
doublechecked s c
e c l  r o     hershey  13
r t y  e lazy
s o    a l
  r    d e
       i choc-o-holic
  6    n t
       g o
        private  16
```