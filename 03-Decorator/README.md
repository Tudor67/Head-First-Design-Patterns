# Decorator

## Notes
__page 85__  
Inheritance is powerful, but it doesn't always lead to the most flexible or maintainable designs.  

__page 86__  
`The Open-Closed Principle:` Classes should be open for extension, but closed for modification.  
The goal is to allow classes to be easily extended to incorporate new behavior without modifying the existing code.  

__page 91__  
`The Decorator Pattern` attaches additional responsibilities to an object dynamically.  
Decorators provide a flexible alternative to subclassing for extending functionalitiy.  

__page 104__  
`+` Decorators add flexibility to designs;  
`-` Decorators can sometimes add a lot of small classes, 
which can make things less straightforward.

## Exercises
__page 83: Sharpen your pencil__  
```
public class Beverage{
    public double cost(){
        double condimentsCost = 0;
        if(hasMilk()){
            condimentsCost += 5;
        }
        if(hasSoy()){
            condimentsCost += 7;
        }
        if(hasMocha()){
            condimentsCost += 8;
        }
        if(hasWhip()){
            condimentsCost += 9;
        }
        return condimentsCost;
    }
}


public class DarkRoast extends Beverage{
    public DarkRoast(){
        description = "Most Excellent Dark Roast";
    }
	
    public double cost(){
        return super.cost() + 15;
    }
}
```

__page 84: Sharpen your pencil__  
What requirements or other factors might change that will impact this design?  
Book:  
  * Price changes for condiments will force us to alter existing code.
  * New condiments will force us to add new methods and alter the cost method in the superclass.
  * We may have new beverages. For some of these beverages (iced tea?), the condiments 
   may not be appropriate, yet the Tea subclass will still inherit methods like hasWhip().
  * What if a customer wants a double mocha?

My turn:  
  * What if some combinations of beverages come with a discount?
  * What if we introduce 3 sizes (small, medium, large) to the menu?  
  
__page 99: Sharpen your pencil__  

```
public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
	
    public int getSize(){
        return beverage.getSize();
    }

    public String getDescription(){
        return beverage.getDescription() + ", Soy";
    }

    public double cost(){
        int size = getSize();
        double totalCost = beverage.cost();
        if(size == Beverage.TALL){
            totalCost += 0.10;
        }else if(size == Beverage.GRANDE){
            totalCost += 0.15;
        }else if(size == Beverage.VENTI){
            totalCost += 0.20;
        }
        return totalCost;
    }
}
```