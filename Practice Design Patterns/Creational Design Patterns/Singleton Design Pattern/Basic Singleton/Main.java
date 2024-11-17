public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        singleton.showMessage();

        Singleton anotherSingleton = Singleton.getInstance();

        System.out.println("Both instances are equal: " + anotherSingleton.equals(singleton));
        System.out.println("Both instances are equal: " + (anotherSingleton == singleton));
    }
}