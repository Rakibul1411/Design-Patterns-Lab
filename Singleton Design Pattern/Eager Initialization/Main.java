public class Main {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.showMessage();

        if (singleton1.equals(singleton2)) {
            System.out.println("Both references the same instance");
        }
        else {
            System.out.println("Both references different instances");
        }

        Runnable task = () -> {
            Singleton instance = Singleton.getInstance();
            instance.showMessage();
            System.out.println(Thread.currentThread().getName() + " : " + instance);
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        Thread thread3 = new Thread(task, "Thread-3");

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

