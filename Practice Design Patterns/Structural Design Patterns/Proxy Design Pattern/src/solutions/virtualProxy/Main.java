package solutions.virtualProxy;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        System.out.println("\n");

        image1.display();
        System.out.println("\n");

        image1.display();
        System.out.println("\n");

        image2.display();
        System.out.println("\n");
    }
}
