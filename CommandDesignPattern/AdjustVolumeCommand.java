package CommandDesignPattern;

public class AdjustVolumeCommand implements Command{
    private Sterio sterio;

    public AdjustVolumeCommand(Sterio sterio)
    {
        this.sterio=sterio;
    }

    @Override
    public void execute() {
        sterio.adjustVolume();
    }
}
