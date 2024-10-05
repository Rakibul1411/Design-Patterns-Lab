public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        Singleton anotherSingleton = Singleton.getInstance();
        anotherSingleton.showMessage();

        System.out.println("Both instances are the same: " + (singleton == anotherSingleton));

        Runnable task = () -> {

            Singleton singleton1 = Singleton.getInstance();
            singleton1.showMessage();
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}