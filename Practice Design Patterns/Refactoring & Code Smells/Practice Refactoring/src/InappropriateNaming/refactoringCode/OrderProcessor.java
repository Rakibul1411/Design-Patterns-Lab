package InappropriateNaming.refactoringCode;

public class OrderProcessor {
    public void processOrder(Order order) {
        validateOrder(order);
        applyDiscount(order);
        calculateShipping(order);
        processPayment(order);
        sendConfirmationEmail(order);
    }

    private void validateOrder(Order order) {
        if (order.getTotalAmount() < 0) {
            throw new IllegalArgumentException("Invalid order total");
        }
        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException("No items in the order");
        }
    }

    private void applyDiscount(Order order) {
        if (order.getCustomer().isPremiumMember()) {
            order.setTotalAmount(order.getTotalAmount() * 0.9);
        }
    }

    private void calculateShipping(Order order) {
        order.setShippingCost(order.getTotalAmount() > 100 ? 0 : 10);
    }

    private void processPayment(Order order) {
        switch (order.getPaymentMethod()) {
            case "credit_card":
                System.out.println("Processing credit card payment...");
                break;
            case "paypal":
                System.out.println("Processing PayPal payment...");
                break;
            default:
                throw new IllegalArgumentException("Invalid payment method");
        }
    }

    private void sendConfirmationEmail(Order order) {
        System.out.println("Order confirmation email sent to " + order.getCustomer().getEmail());
    }
}
