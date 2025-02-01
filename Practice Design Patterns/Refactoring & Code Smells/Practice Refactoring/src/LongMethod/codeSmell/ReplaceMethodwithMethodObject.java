package LongMethod.codeSmell;

/*
Code Smell:
The method has too many steps,
and the logic is difficult to manage within a single function.
*/
public class ReplaceMethodwithMethodObject {
    public double calculateOrderTotal(Order order) {
        double discount = 0;
        if (order.getCustomer().isPremium()) {
            discount = order.getTotal() * 0.1; // 10% discount for premium customers
        }

        double shipping = 0;
        if (order.getTotal() > 100) {
            shipping = 0; // Free shipping for orders above $100
        } else {
            shipping = 10; // Standard shipping fee
        }

        double tax = order.getTotal() * 0.05; // 5% tax
        return order.getTotal() - discount + shipping + tax;
    }

}
