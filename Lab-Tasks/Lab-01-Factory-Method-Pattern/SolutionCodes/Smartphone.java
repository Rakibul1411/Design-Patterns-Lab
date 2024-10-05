package lab_01_factory_pattern_method.solutionCodes;

public class Smartphone implements Devices{

    @Override
    public void powerOn() {
        System.out.println("I am in Smartphone class powerOn method");
    }

    @Override
    public void powerOff() {
        System.out.println("I am in Smartphone class powerOff method");
    }

    int cameraNumber;

    Smartphone(int cameraNumber) {
        this.cameraNumber = cameraNumber;
    }

    void takePhoto () {
        System.out.println("Take photo using " + cameraNumber + " camera");
    }
}
