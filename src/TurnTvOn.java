

public class TurnTvOn implements Command {
    ElectronicDevice electronicDevice;

    public TurnTvOn(ElectronicDevice newDevice) {
        this.electronicDevice = newDevice;
    }

    @Override
    public void execute() {
        electronicDevice.on();
    }
}
