
public class SmartphoneFactory extends DeviceFactory{

    @Override
    public Devices createDevice() {
        return new Smartphone(3);
    }
}
