public class TheaterLights {

    public TheaterLights() {

    }

    public void on() {
        System.out.println("Theater Ceiling Lights on");
    }

    public void dim(int percents) {
        System.out.println("Theater Ceiling Lights dimming to " + percents + "%");
    }
    
    public void off() {
        System.out.println("Theater Ceiling Lights off");
    }
}