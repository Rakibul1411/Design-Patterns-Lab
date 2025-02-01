package LongMethod.refactoringCode;

public class PreserveWholeObject {
    public void calculateShipping(Order order) {
        double shipping = order.getTotal() > 100 ? 0 : 10;
        System.out.println("Shipping for customer " + order.getCustomer().getName() + ": $" + shipping);
    }
}
