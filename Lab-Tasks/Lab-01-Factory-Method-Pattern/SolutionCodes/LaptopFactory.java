
public class LaptopFactory extends DeviceFactory{

    @Override
    public Devices createDevice() {
        return new Laptop(8);
    }
}
