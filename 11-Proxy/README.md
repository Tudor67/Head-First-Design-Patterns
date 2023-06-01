# Proxy

## Notes
__page 436__  
* `Java RMI` gives us a way to find objects in a remote JVM and allows us to invoke their methods;  

__page 440__  
* What `Java RMI` does for you is build the client (stub) and service (skeleton) helper objects, 
right down to creating a client helper object with the same methods as the remote service;  
* The nice thing about `Java RMI` is that you don't have to write any of networking or I/O code yourself;  
* The networking and I/O methods are risky, they can fail and throw exceptions all over the place;  

__page 442__  
* Be sure arguments and return values of remote methods are primitives or Serializable;  

__page 443__  
* When you register the service implementation object (with `Naming.rebind('ServiceName', serviceRemoteInterface)`), 
the RMI system actually puts the stub in the registry, since that's what the client really needs;  

__page 460__  
* `The Proxy Pattern` provides a surrogate or placeholder for another object to control access to it.  
* Use the Proxy Pattern to create a representative object that controls access to another object, which may be remote, 
expensive to create or in need of securing;  
* There are many `variations of the Proxy Pattern` and the variations typically revolve around the way the proxy controls access:  
  * `Remote Proxy` controls access to a remote object (it handles the network details for us);  
  * `Virtual Proxy` controls access to a resource that is expensive to create (it hides an object during its creation);  
  * `Protection Proxy` controls access to a resource based on access rights;  

__page 488__  
* Other variations of the proxy pattern:  
  * `Firewall Proxy` controls access to a set of network resources, protecting the subject from bad clients;  
  * `Smart Reference Proxy` provides additional actions whenever a subject is referenced, 
  such as counting the number of references to an object;  
  * `Caching Proxy` provides temporary storage for results of operations that are expensive;  
  It can also allow multiple clients to share the results to reduce computation or network latency;  
  * `Synchronization Proxy` provides safe access to a subject from multiple threads;  
  * `Complexity Hiding Proxy` hides the complexity of and controls access to a complex set of classes;  
  This is sometimes called the Facade Proxy for obvious reasons;   
  * `Copy-On-Write Proxy` controls the copying of an object by deferring the copying of an object until it is required by a client;  
  This is a variant of Virtual Proxy;  
  
__page 491__  
* Java's built-in support for Proxy can build a dynamic proxy class on demand and dispatch all calls on it to a handler of your choosing;  
* Like any wrapper, proxies will increase the number of classes and objects in your design;  

## Exercises
__page 487: Who Does What__  
**Pattern** -> **Description**  
`Decorator` -> Wraps another object and provides additional behavior for it;  
`Adapter` -> Wraps another objects and provides a different interface to it;  
`Facade` -> Wraps a bunch of objects to simplify their interface;  
`Proxy` -> Wraps another object to control access to it;  

__page 490: Crossword Puzzle__  
```
         aphextwin
                n
                virtual
 detour         o
  n   methodinvocation
  i   i         a  g
  g  protection t  u
  m d e         i  a
  a e g   skeleton n
    c i  h      n  a
 r  o s  o      h
 e protection   a
 m  a r  o    dynamic
zoo t y  r      d
 t  o    n      l
webproxy o      e
        stub  virtual
```