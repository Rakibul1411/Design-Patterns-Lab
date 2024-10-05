package lab_01_factory_pattern_method.solutionCodes;

public class LaptopFactory extends DeviceFactory{

    @Override
    public Devices createDevice() {
        return new Laptop(8);
    }
}
