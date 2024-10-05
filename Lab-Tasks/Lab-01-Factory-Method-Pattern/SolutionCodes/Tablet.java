package lab_01_factory_pattern_method.solutionCodes;

public class Tablet implements Devices{

    @Override
    public void powerOn() {
        System.out.println("I am in Tablet class powerOn method");
    }

    @Override
    public void powerOff() {
        System.out.println("I am in Tablet class powerOff method");
    }

    int screenSize;

    Tablet(int screenSize) {
        this.screenSize = screenSize;
    }

    void writeScreen() {
        System.out.println("Write on screen " + screenSize + " inches with pen");
    }
}
