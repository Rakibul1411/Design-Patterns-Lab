package solutions.codes.classAdapter1;

public class Adapter extends Service implements ClientInterface{

    @Override
    public String request(String data) {
        String adaptedData = convertToServiceFormat(data);

        return specificRequest(adaptedData);
    }

    private String convertToServiceFormat(String data) {
        return "Adapted_" + data;
    }
}
