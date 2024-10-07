
public class SmartWatchFactory extends DeviceFactory{

    @Override
    public Devices createDevice() {
        return new SmartWatch(true);
    }
}
