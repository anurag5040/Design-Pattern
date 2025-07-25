package CommandDesignPattern;

public class Main {
    public static void main(String[] args) {
        //create device
        TV tv=new TV();
        Sterio sterio=new Sterio();

        //create commands
        Command turnOnTVCommand=new TurnOnCommand(tv);
        Command turnOnSterioCommand=new TurnOnCommand(sterio);

        Command turnOffTVCommand=new TurnOffCommand(tv);
        Command turnOffSterioCommand=new TurnOffCommand(sterio);

        Command adjustVolumeCommand=new AdjustVolumeCommand(sterio);
        Command changeChannelCommand=new ChangeChannelCommand(tv);

        //create a remote control
        RemoteControl remoteControl=new RemoteControl();

        //set and execute command
        remoteControl.setCommand(turnOnTVCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffTVCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOnSterioCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffSterioCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(adjustVolumeCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(changeChannelCommand);
        remoteControl.pressButton();
    }
}
