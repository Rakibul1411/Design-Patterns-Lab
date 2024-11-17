package solutions.packageBuilderImplementation.builder;

import solutions.packageBuilderImplementation.product.Manual;

public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int number) {
        manual.setSeats(number);
    }

    @Override
    public void setEngine(String engineType) {
        manual.setEngine(engineType);
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        manual.setTripComputer(hasTripComputer);
    }

    @Override
    public void setGPS(boolean hasGPS) {
        manual.setGPS(hasGPS);
    }

    public Manual getResult() {
        return this.manual;
    }
}
