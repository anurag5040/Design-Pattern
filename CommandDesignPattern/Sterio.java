package CommandDesignPattern;

public class Sterio implements Device {
    @Override
    public void turnOn() {
        System.out.println("Sterio is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Sterio is turned off");
    }

    public void adjustVolume()
    {
        System.out.println("Volume is adjusted");
    }
}
