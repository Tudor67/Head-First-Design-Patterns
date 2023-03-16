public class ChicagoStyleClamPizza extends Pizza{
    
    public ChicagoStyleClamPizza(){
        name = "Chicago Style Clam Pizza";
        dough = "Thick Dough";
        sauce = "Tomato Sauce";
        toppings.add("Shredded Cheese");
    }
    
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}