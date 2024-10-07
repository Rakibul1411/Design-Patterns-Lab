
public class SmartWatch implements Devices{
    @Override
    public void powerOn() {
        System.out.println("I am in smartWatch class powerOn method");
    }

    @Override
    public void powerOff() {
        System.out.println("I am in smartWatch class powerOff method");
    }

    boolean heartRateMonitor;

    SmartWatch(boolean heartRateMonitor) {
        this.heartRateMonitor = heartRateMonitor;
    }

    void tackHeartRate() {
        if (heartRateMonitor) {
            System.out.println("Heart Rate Monitor Active");
        }
        else {
            System.out.println("Heart Rate Monitor Inactive");
        }
    }
}
