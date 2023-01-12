public class TurnTvOff implements Command {
    ElectronicDevice electronicDevice;

    public TurnTvOff(ElectronicDevice newDevice) {
        this.electronicDevice = newDevice;

    }

    @Override
    public void execute() {
        electronicDevice.off();
    }
}
