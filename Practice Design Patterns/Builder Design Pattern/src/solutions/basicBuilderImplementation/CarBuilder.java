package solutions.basicBuilderImplementation;

public class CarBuilder implements Builder{
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {
        car.setSeats(number);
    }

    @Override
    public void setEngine(String engineType) {
        car.setEngine(engineType);
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        car.setTripComputer(hasTripComputer);
    }

    @Override
    public void setGPS(boolean hasGPS) {
        car.setGPS(hasGPS);
    }

    public Car getResult() {
        return this.car;
    }
}
