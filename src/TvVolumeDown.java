public class TvVolumeDown implements Command {
    ElectronicDevice electronicDevice;

    public TvVolumeDown(ElectronicDevice newDevice) {
        this.electronicDevice = newDevice;

    }

    @Override
    public void execute() {
        electronicDevice.volumeDown();
    }
}
