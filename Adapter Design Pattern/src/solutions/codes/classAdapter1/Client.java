package solutions.codes.classAdapter1;

public class Client {
    private ClientInterface clientInterface;

    public Client(ClientInterface clientInterface) {
        this.clientInterface = clientInterface;
    }

    public void execute(String data) {
        String result = clientInterface.request(data);
        System.out.println("Client received: " + result);
    }
}
