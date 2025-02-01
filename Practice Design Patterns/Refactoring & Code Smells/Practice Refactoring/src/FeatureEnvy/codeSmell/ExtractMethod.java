package FeatureEnvy.codeSmell;

public class ExtractMethod {
    public class Order {
        private double totalAmount;

        public double getTotalAmount() {
            return totalAmount;
        }
    }

    public class Payment {
        private Order order;

        public Payment(Order order) {
            this.order = order;
        }

        public double calculateTax() {
            double taxRate = 0.1; // 10% tax
            return order.getTotalAmount() * taxRate; // Depends on Order's data
        }
    }
}
