package LongParameterList.codeSmell;

public class ReplaceParameterWithMethod {
    public void printCustomerDetails(String customerName, String customerEmail) {
        System.out.println("Name: " + customerName);
        System.out.println("Email: " + customerEmail);
    }
}
