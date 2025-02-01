package Comment.codeSmell.IntroduceAssertion;

public class OrderProcessor {
    public void processOrder(Order order) {
        if (order == null) {
            throw new IllegalArgumentException("Order cannot be null");
        }
        if (order.getCustomer() == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }
        if (order.getTotal() < 0) {
            throw new IllegalArgumentException("Invalid order total");
        }
        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException("No items in the order");
        }
    }
}
