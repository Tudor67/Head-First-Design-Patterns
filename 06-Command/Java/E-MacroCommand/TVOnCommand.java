public class TVOnCommand implements Command {
    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.on();
        tv.setDVD();
    }

    public void undo() {
        tv.off();
    }
}