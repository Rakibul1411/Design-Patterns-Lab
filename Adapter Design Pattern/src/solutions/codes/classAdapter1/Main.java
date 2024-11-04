package solutions.codes.classAdapter1;

public class Main {
    public static void main(String[] args) {
        ClientInterface adapter = new Adapter();
        Client client = new Client(adapter);

        client.execute("ClientData");
    }
}
