public class RedheadDuck implements Quackable {
    private Observable observable;

    public RedheadDuck() {
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