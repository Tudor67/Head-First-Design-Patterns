public abstract class Pizza{
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract void prepare();

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("\n");
        sb.append(getName());
        sb.append("\n   ");
        sb.append(dough);
        sb.append("\n   ");
        sb.append(sauce);
        sb.append("\n   ");
        sb.append(cheese);
        sb.append("\n   ");
        sb.append(pepperoni);
        sb.append("\n   ");
        sb.append(clam);

        if(veggies != null){
            for(int i = 0; i < veggies.length; ++i){
                sb.append("\n   ");
                sb.append(veggies[i]);
            }
        }

        return sb.toString();
    }
}