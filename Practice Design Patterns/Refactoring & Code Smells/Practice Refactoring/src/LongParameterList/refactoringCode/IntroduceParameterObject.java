package LongParameterList.refactoringCode;

public class IntroduceParameterObject {
    public void processOrder(OrderDetails orderDetails) {
        System.out.println("Processing order for: " + orderDetails.getCustomerName());
        System.out.println("Email: " + orderDetails.getCustomerEmail());
        System.out.println("Order Total: $" + (orderDetails.getOrderTotal() + orderDetails.getShippingCost()));
    }
}



public class OrderDetails {
    private String customerName;
    private String customerEmail;
    private double orderTotal;
    private double shippingCost;

    public OrderDetails(String customerName, String customerEmail, double orderTotal, double shippingCost) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.orderTotal = orderTotal;
        this.shippingCost = shippingCost;
    }

    public String getCustomerName() { return customerName; }
    public String getCustomerEmail() { return customerEmail; }
    public double getOrderTotal() { return orderTotal; }
    public double getShippingCost() { return shippingCost; }
}
