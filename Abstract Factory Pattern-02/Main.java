import java.util.Scanner;

public class Main {
  
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter OS type (Windows/Mac/Linux): "); 
    String osType = scanner.nextLine();

    GUIFactory factory = GUIFactoryProvider.getFactory(osType);

    Application app = new Application(factory);

    app.render();

    scanner.close();
  }

}
