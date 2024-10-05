package lab_01_factory_pattern_method.solutionCodes;

public class Laptop implements Devices{

    @Override
    public void powerOn() {
        System.out.println("I am in Laptop class powerOn method");
    }

    @Override
    public void powerOff() {
        System.out.println("I am in Laptop class powerOff method");
    }

    int ram;

    Laptop(int ram) {
        this.ram = ram;
    }

    void compileCode () {
        System.out.println("Compile code with " + ram + "GB ram");
    }
}
