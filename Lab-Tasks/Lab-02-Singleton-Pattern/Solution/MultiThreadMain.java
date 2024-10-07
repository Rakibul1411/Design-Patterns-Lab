package code.solutions;

import java.util.Scanner;

public class MultiThreadMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean check = true;

        while (check){
            System.out.println("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();

            if (choice == 1){
                FurnitureFactory factory1 = ModernFurnitureFactory.getInstance();
                Runnable task1 = () -> {
                    FurnitureStore factoryStore = new FurnitureStore(factory1);
                    factoryStore.useFurniture();
                };

                Thread thread1 = new Thread(task1);
                Thread thread2 = new Thread(task1);

                thread1.start();
                thread2.start();

                try {
                    thread1.join();
                    thread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else if (choice == 2){
                FurnitureFactory factory2 = VictorianFurnitureFactory.getInstance();

                Runnable task2 = () -> {
                    FurnitureStore factoryStore = new FurnitureStore(factory2);
                    factoryStore.useFurniture();
                };

                Thread thread1 = new Thread(task2);
                Thread thread2 = new Thread(task2);

                thread1.start();
                thread2.start();

                try {
                    thread1.join();
                    thread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else if (choice == 3){
                FurnitureFactory factory3 = RusticFurnitureFactory.getInstance();
                Runnable task3 = () -> {
                    FurnitureStore factoryStore = new FurnitureStore(factory3);
                    factoryStore.useFurniture();
                };

                Thread thread1 = new Thread(task3);
                Thread thread2 = new Thread(task3);

                thread1.start();
                thread2.start();

                try {
                    thread1.join();
                    thread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else{
                // Exit the loop
               break;
            }
        }

        scanner.close();

    }
}
