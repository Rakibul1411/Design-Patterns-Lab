package LongMethod.refactoringCode;

public class ExtractMethod {
    public double calculateFinalAmount(Order order) {
        validateOrder(order);
        applyDiscount(order);
        double shippingCost = calculateShipping(order);
        return order.getTotal() + shippingCost;
    }

    private void validateOrder(Order order) {
        if (order.getTotal() < 0) {
            throw new IllegalArgumentException("Order total cannot be negative.");
        }
    }

    private void applyDiscount(Order order) {
        if (order.getCustomer().isPremium()) {
            order.setTotal(order.getTotal() * 0.9);
        }
    }

    private double calculateShipping(Order order) {
        return order.getTotal() > 100 ? 0 : 10;
    }
}
