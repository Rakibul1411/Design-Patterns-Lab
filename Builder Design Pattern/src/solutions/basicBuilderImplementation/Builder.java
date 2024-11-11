package solutions.basicBuilderImplementation;

public interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(String engineType);
    void setTripComputer(boolean hasTripComputer);
    void setGPS(boolean hasGPS);
}
