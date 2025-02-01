package FeatureEnvy.refactoringCode;

public class ExtractMethod {
    public class Order {
        private double totalAmount;

        public double getTotalAmount() {
            return totalAmount;
        }

        public double calculateTax() {
            double taxRate = 0.1;
            return totalAmount * taxRate;
        }
    }

    public class Payment {
        private Order order;

        public Payment(Order order) {
            this.order = order;
        }

        public double getTax() {
            return order.calculateTax();
        }
    }
}
