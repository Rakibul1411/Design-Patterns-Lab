package solutions.codes.objectAdapter1;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        ClientInterface adapter = new Adapter(service);

        Client client = new Client(adapter);

        client.execute("HalloAdapter");

    }
}
