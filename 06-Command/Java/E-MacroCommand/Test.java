public class Test {
    
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        Command tvOn = new TVOnCommand(tv);
        Command tvOff = new TVOffCommand(tv);

        Command stereoOn = new StereoOnCommand(stereo);
        Command stereoOff = new StereoOffCommand(stereo);

        Command hottubOn = new HottubOnCommand(hottub);
        Command hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn };
        Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff };

        Command partyOnMacroCommand = new MacroCommand(partyOn);
        Command partyOffMacroCommand = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacroCommand, partyOffMacroCommand);
        
        System.out.println(remoteControl);

        System.out.println("\n--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(0);

        System.out.println("\n--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(0);

        System.out.println("\n--- Pushing Macro Undo ---");
        remoteControl.undoButtonWasPushed();
    }
}