public class Test {
    
    public static void main(String[] args) {
        System.out.println("\nTea");
        Tea myTea = new Tea();
        myTea.prepareRecipe();

        System.out.println("\nCoffee");
        Coffee myCoffee = new Coffee();
        myCoffee.prepareRecipe();
    }
}