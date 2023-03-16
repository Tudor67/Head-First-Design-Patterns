public class Test{

    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("Cheese");
        System.out.println("Ethan ordered a: " + pizza + "\n");

        pizza = chicagoStore.orderPizza("Cheese");
        System.out.println("Joel ordered a: " + pizza + "\n");

        pizza = chicagoStore.orderPizza("Pepperoni");
        System.out.println("Tom ordered a: " + pizza + "\n");
    }
}