package lab_01_factory_pattern_method.solutionCodes;

public class TabletFactory extends DeviceFactory{

    @Override
    public Devices createDevice() {
        return new Tablet(11);
    }
}
