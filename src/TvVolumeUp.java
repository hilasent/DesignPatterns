public class TvVolumeUp implements Command {
    ElectronicDevice electronicDevice;

    public TvVolumeUp(ElectronicDevice newDevice) {
        this.electronicDevice = newDevice;

    }

    @Override
    public void execute() {
        electronicDevice.volumeUp();
    }
}
