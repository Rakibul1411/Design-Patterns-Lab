package solutions.basicBuilderImplementation;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car sportCar = carBuilder.getResult();
        System.out.println("Built Car: " + sportCar);

        director.constructSUV(carBuilder);
        Car suvCar = carBuilder.getResult();
        System.out.println("Built SUV: " + suvCar);

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual sportCarManual = manualBuilder.getResult();
        System.out.println("Built Manual: " + sportCarManual);
    }
}
