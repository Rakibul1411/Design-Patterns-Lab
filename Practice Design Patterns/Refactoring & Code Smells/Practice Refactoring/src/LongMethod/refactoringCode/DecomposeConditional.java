package LongMethod.refactoringCode;

public class DecomposeConditional {
    public double calculateShipping(Order order) {
        if (isFreeShipping(order)) {
            return 0;
        }
        else if (isDiscountedShipping(order)) {
            return 5;
        }
        else if (isStandardShipping(order)) {
            return 10;
        }
        else {
            return 15;
        }
    }

    private boolean isFreeShipping(Order order) {
        return order.getTotal() > 100;
    }

    private boolean isDiscountedShipping(Order order) {
        return order.getTotal() > 50 && order.getCustomer().isPremium();
    }

    private boolean isStandardShipping(Order order) {
        return order.getTotal() > 50 && !order.getCustomer().isPremium();
    }
}
