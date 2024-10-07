import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which device would you like to use?");

        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Tablet");
        System.out.println("4. Smartwatch");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Use smartphone");
            DeviceFactory smartphoneFactory = new SmartphoneFactory();
            Devices smartphone = smartphoneFactory.createDevice();
            smartphone.powerOn();
            smartphone.powerOff();

            if (smartphone instanceof Smartphone) {
                Smartphone smartphone1 = (Smartphone) smartphone;
                smartphone1.takePhoto(); // Call smartphone-specific method
            }

            if (smartphone instanceof Smartphone) {
                ((Smartphone) smartphone).takePhoto(); // Call smartphone-specific method
            }

            // Alternatively, create a new Smartphone directly
            Smartphone smartphone2 = new Smartphone(2);
            smartphone2.takePhoto();
        }
        else if (choice == 2) {
            System.out.println("Use laptop");
            DeviceFactory laptopFactory = new LaptopFactory();
            Devices laptop = laptopFactory.createDevice();
            laptop.powerOn();
            laptop.powerOff();

            Laptop laptop1 = new Laptop(3);
            laptop1.compileCode();
        }
        else if (choice == 3) {
            System.out.println("Use tablet");
            DeviceFactory tabletFactory = new TabletFactory();
            Devices tablet = tabletFactory.createDevice();
            tablet.powerOn();
            tablet.powerOff();

            Tablet tablet1 = new Tablet(11);
            tablet1.writeScreen();
        }
        else if (choice == 4) {
            System.out.println("Use smartphone");
            DeviceFactory smartwatchFactory = new SmartWatchFactory();
            Devices smartwatch = smartwatchFactory.createDevice();
            smartwatch.powerOn();
            smartwatch.powerOff();

            SmartWatch smartWatch = new SmartWatch(true);
            smartWatch.tackHeartRate();
        }

    }
}
