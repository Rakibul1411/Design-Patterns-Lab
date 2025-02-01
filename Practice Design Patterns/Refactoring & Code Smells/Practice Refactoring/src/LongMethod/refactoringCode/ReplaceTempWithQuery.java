package LongMethod.refactoringCode;

public class ReplaceTempWithQuery {
    public double calculateTotal(Order order) {
        return order.getTotal() - getDiscount(order) + getShippingCost(order);
    }

    private double getDiscount(Order order) {
        return order.getCustomer().isPremium() ? order.getTotal() * 0.1 : 0;
    }

    private double getShippingCost(Order order) {
        return order.getTotal() > 100 ? 0 : 10;
    }
}
