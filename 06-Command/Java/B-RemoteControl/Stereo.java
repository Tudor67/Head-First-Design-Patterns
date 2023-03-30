public class Stereo {
    private String name;
    private int volume;

    public Stereo(String name) {
        this.name = name;
        this.volume = 0;
    }

    public void on() {
        System.out.println(name + " stereo is on");
    }

    public void off() {
        System.out.println(name + " stereo is off");
    }

    public void setCD() {
        System.out.println(name + " stereo is set for CD input");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(name + " stereo volume set to " + this.volume);
    }
}