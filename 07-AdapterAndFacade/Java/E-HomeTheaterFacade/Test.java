public class Test {
    
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();
        
        HomeTheaterFacade homeTheater = 
            new HomeTheaterFacade(amp, tuner, dvd, cd,
                                  projector, screen, lights, popper);

        homeTheater.watchMovie("Raiders of the Lost Ark");

        System.out.println();

        homeTheater.endMovie();
    }
}