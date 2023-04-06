public class CdPlayer {
    private String movieName;

    public CdPlayer() {
        this.movieName = "No Name";
    }

    public void on() {
        System.out.println("Cd Player on");
    }

    public void play(String movieName) {
        this.movieName = movieName;
        System.out.println("Cd Player playing " + movieName);
    }

    public void stop() {
        System.out.println("Cd Player stopped " + movieName);
    }

    public void eject() {
        System.out.println("Cd Player eject");
    }

    public void off() {
        System.out.println("Cd Player off");
    }
}