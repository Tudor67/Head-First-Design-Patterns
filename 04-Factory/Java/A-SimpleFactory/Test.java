public class Test{
    
    public static void main(String[] args){
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);

        pizzaStore.orderPizza("Cheese");
        System.out.println();

        pizzaStore.orderPizza("Veggie");
        System.out.println();

        pizzaStore.orderPizza("Clam");
        System.out.println();

        pizzaStore.orderPizza("Pepperoni");
        System.out.println();
    }
}