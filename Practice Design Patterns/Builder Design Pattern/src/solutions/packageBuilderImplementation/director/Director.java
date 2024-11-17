package solutions.packageBuilderImplementation.director;

import solutions.packageBuilderImplementation.builder.Builder;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("Sport Engine");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void constructSUV(Builder builder) {
        builder.reset();
        builder.setSeats(5);
        builder.setEngine("SUV Engine");
        builder.setTripComputer(false);
        builder.setGPS(true);
    }
}