package LongMethod.refactoringCode;

public class ReplaceMethodwithMethodObject {
    public class OrderCalculator {
        private Order order;

        public OrderCalculator(Order order) {
            this.order = order;
        }

        public double calculateTotal() {
            return order.getTotal() - calculateDiscount() + calculateShipping() + calculateTax();
        }

        private double calculateDiscount() {
            return order.getCustomer().isPremium() ? order.getTotal() * 0.1 : 0;
        }

        private double calculateShipping() {
            return order.getTotal() > 100 ? 0 : 10;
        }

        private double calculateTax() {
            return order.getTotal() * 0.05;
        }
    }
}
