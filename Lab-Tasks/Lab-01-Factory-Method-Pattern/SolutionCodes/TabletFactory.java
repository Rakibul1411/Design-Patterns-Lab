
public class TabletFactory extends DeviceFactory{

    @Override
    public Devices createDevice() {
        return new Tablet(11);
    }
}
