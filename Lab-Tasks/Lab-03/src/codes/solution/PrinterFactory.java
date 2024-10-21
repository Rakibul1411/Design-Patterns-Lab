package codes.solution;

import java.util.HashMap;
import java.util.Map;

public class PrinterFactory {
    private static PrinterFactory instance;

    private final Map<String, Printer> printerRegistry;

    private PrinterFactory() {
        printerRegistry = new HashMap<>();
    }

    public static PrinterFactory getInstance() {
        if (instance == null) {
            instance = new PrinterFactory();
        }

        return instance;
    }

    public Printer getPrinter(String department) {
        if (!printerRegistry.containsKey(department)) {
            Printer newPrinter = new Printer(department);
            printerRegistry.put(department, newPrinter);
        }

        return printerRegistry.get(department);
    }

}
