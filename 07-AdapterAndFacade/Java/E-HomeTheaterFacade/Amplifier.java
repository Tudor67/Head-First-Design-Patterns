public class Amplifier {
    DvdPlayer dvd;
    int volume;

    public Amplifier() {
        this.dvd = null;
        this.volume = 0;
    }

    public void on() {
        System.out.println("Amplifier on");
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
        System.out.println("Amplifier setting DVD Player");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier surround sound on");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Amplifier set volume to " + volume);
    }

    public void off() {
        System.out.println("Amplifier off");
    }
}