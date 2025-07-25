package CommandDesignPattern;

public class TV implements Device{
    @Override
    public void turnOff() {
        System.out.println("TV is turned off");
    }

    @Override
    public void turnOn() {
        System.out.println("TV is turned on");
    }

    public void changeChannel()
    {
        System.out.println("Channel is changed");
    }
}
