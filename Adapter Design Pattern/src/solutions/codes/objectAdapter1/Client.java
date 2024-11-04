package solutions.codes.objectAdapter1;

public class Client {
    private ClientInterface clientInterface;

    public Client(ClientInterface clientInterface) {
        this.clientInterface = clientInterface;
    }

    public void execute(String data) {
        clientInterface.method(data);
    }
}
