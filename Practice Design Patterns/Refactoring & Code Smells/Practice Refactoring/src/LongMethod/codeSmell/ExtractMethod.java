package LongMethod.codeSmell;

public class ExtractMethod {
    public double calculateFinalAmount(Order order) {
        // Validate the order
        if (order.getTotal() < 0) {
            throw new IllegalArgumentException("Order total cannot be negative.");
        }

        // Apply a discount
        if (order.getCustomer().isPremium()) {
            order.setTotal(order.getTotal() * 0.9);
        }

        // Calculate shipping cost
        double shippingCost = order.getTotal() > 100 ? 0 : 10;

        // Return the final amount
        return order.getTotal() + shippingCost;
    }

}
