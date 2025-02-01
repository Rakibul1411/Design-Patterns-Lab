abstract class DataProcessor {
    // Template Method
    public final void processData() {
        readData();
        process();
        saveData();
    }

    // Common steps
    void readData() {
        System.out.println("Reading data from source");
    }

    void saveData() {
        System.out.println("Saving data to destination");
    }

    // Abstract step (to be implemented by subclasses)
    abstract void process();
}
