package solutions.packageBuilderImplementation.client;

import solutions.packageBuilderImplementation.builder.CarBuilder;
import solutions.packageBuilderImplementation.builder.CarManualBuilder;
import solutions.packageBuilderImplementation.director.Director;
import solutions.packageBuilderImplementation.product.Car;
import solutions.packageBuilderImplementation.product.Manual;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        // Building a sports car
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car sportsCar = carBuilder.getResult();
        System.out.println("Built Car: " + sportsCar);

        // Building an SUV
        director.constructSUV(carBuilder);
        Car suvCar = carBuilder.getResult();
        System.out.println("Built Car: " + suvCar);

        // Building a manual for the sports car
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual sportsCarManual = manualBuilder.getResult();
        System.out.println("Built Manual: " + sportsCarManual);
    }
}