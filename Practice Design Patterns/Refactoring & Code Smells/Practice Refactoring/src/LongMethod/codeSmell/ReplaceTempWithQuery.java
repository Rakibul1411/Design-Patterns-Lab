package LongMethod.codeSmell;

public class ReplaceTempWithQuery {
    public double calculateTotal(Order order) {
        double discount = order.getCustomer().isPremium() ? order.getTotal() * 0.1 : 0;
        double shipping = order.getTotal() > 100 ? 0 : 10;
        return order.getTotal() - discount + shipping;
    }
}
