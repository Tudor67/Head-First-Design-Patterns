public class Test {
    
    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();
        MallardDuck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("The Duck says ...");
        duck.quack();
        duck.fly();

        System.out.println("\nThe Turkey says ...");
        testTurkey(turkey);

        System.out.println("\nThe DuckAdapter says ...");
        testTurkey(duckAdapter);
    }

    public static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}