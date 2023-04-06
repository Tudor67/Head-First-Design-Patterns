public class DvdPlayer {
    private String movieName;

    public DvdPlayer() {
        this.movieName = "No Name";
    }

    public void on() {
        System.out.println("DVD Player on");
    }

    public void play(String movieName) {
        this.movieName = movieName;
        System.out.println("DVD Player playing " + movieName);
    }

    public void stop() {
        System.out.println("DVD Player stopped " + movieName);
    }

    public void eject() {
        System.out.println("DVD Player eject");
    }

    public void off() {
        System.out.println("DVD Player off");
    }
}