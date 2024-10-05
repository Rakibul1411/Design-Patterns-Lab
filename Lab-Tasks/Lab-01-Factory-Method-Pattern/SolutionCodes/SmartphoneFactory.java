package lab_01_factory_pattern_method.solutionCodes;

public class SmartphoneFactory extends DeviceFactory{

    @Override
    public Devices createDevice() {
        return new Smartphone(3);
    }
}
