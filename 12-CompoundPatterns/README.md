# Compound Patterns

## Notes
__page 500__  
* A compound pattern combines two or more patterns into a solution that solves a recurring or general problem.  

__page 528__  
* `MVC` is a powerful compound pattern that will save you hours of writing code.  

__page 530__  
* `Model`  
  * Holds all the data, state and application logic (i.e., the code that manages and manipulates the data);  
  * Is oblivious to (doesn't know anything about, is decoupled from) the view and controller, although it provides a interface to manipulate and retrieve its state;  
* `View`  
  * Gives a presentation of the model;  
  * Usually gets the state and data it needs to display directly from the model;  
* `Controller`  
  * Takes user input and figures out how to translate that into requests on the model;  
  * It separates the logic of control from the view => the view code becomes simpler, it remains with only one responsibility (to manage the user interface);  
  * It decouples the view from the model => which results in a more flexible and extensible design (we can reuse the view with another model);  

__page 532__  
* The model uses `Observer` to keep the views and controllers updated on the latest changes.  
The `Observer Pattern` keeps the model completely independent of the views and and controllers;  
* The view and the controller implement the `Strategy Pattern`.  
The controller is the behavior of the view and it can be easily exchanged with another controller if we want different behavior;  
* The view itself uses the `Composite Pattern` internally to manage the windows, buttons and other components of the display;  

__page 560__  
* The **Model-View-Controller** (MVC) Pattern is a compound pattern consisting of the **Observer**, **Strategy** and **Composite** patterns.  
* The `model` makes use of the `Observer Pattern` so that it can keep observers updated yet stay decoupled from them.  
* The `controller` is the `strategy` for the view. The view can use different implementations of the controller to get different behavior.  
* The `view` uses the `Composite Pattern` to implement the user interface, which usually consists of nested components like panels, frames and buttons.  
* These patterns work together to **decouple** the three players in the MVC model, which **keeps designs clear and flexible**.  
* **Model 2** is an adaptation of MVC for web applications.  
* In Model 2, the controller is implemented as a servlet and JSP & HTML implement the view.  