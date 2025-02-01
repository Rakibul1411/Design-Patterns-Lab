package LongMethod.codeSmell;

/*
"Decompose Conditional" is a refactoring technique used when
a complex conditional statement (e.g., if, else if, else, or switch)
is difficult to read or understand. Instead of having a large, hard-to-follow
conditional block, you break it into smaller, self-explanatory methods or conditions.
*/

public class DecomposeConditional {
    public double calculateShipping(Order order) {
        if (order.getTotal() > 100) {
            return 0; // Free shipping for orders above $100
        } else if (order.getTotal() > 50 && order.getCustomer().isPremium()) {
            return 5; // Discounted shipping for premium customers with total > $50
        } else if (order.getTotal() > 50) {
            return 10; // Standard shipping for non-premium customers with total > $50
        } else {
            return 15; // Shipping for orders <= $50
        }
    }
}
