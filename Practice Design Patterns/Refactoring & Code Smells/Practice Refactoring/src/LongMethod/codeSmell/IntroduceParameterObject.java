package LongMethod.codeSmell;

// Code smell --> a method takes 'too many parameters'
public class IntroduceParameterObject {
    public void processOrder(String customerName, String customerEmail, double orderTotal, double shippingCost) {
        System.out.println("Processing order for: " + customerName);
        System.out.println("Email: " + customerEmail);
        System.out.println("Total: $" + (orderTotal + shippingCost));
    }
}
