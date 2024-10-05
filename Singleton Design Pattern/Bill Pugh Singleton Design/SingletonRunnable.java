public class SingletonRunnable implements Runnable{

    @Override
    public void run() {

        // Get the Singleton instance
        Singleton instance = Singleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + instance);
    }
}
