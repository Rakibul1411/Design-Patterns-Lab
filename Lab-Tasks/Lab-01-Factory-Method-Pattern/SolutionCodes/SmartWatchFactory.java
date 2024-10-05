package lab_01_factory_pattern_method.solutionCodes;

public class SmartWatchFactory extends DeviceFactory{

    @Override
    public Devices createDevice() {
        return new SmartWatch(true);
    }
}
