package LongMethod.refactoringCode;

public class IntroduceParameterObject {
    public void processOrder(OrderDetails orderDetails) {
        System.out.println("Processing order for: " + orderDetails.getCustomerName());
        System.out.println("Email: " + orderDetails.getCustomerEmail());
        System.out.println("Total: $" + orderDetails.getFinalAmount());
    }
}
