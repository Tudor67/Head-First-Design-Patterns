public class MallardDuck implements Quackable {
    private Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    public void quack(){
        System.out.println("Quack");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}