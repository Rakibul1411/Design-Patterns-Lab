package Comment.refactoringCode.IntroduceAssertion;

public class OrderProcessor {
    public void processOrder(Order order) {
        assert order != null : "Order must not be null";
        assert order.getCustomer() != null : "Customer must not be null";
        assert order.getTotal() >= 0 : "Total amount cannot be negative";
        assert !order.getItems().isEmpty() : "Order must contain at least one item";
    }
}
