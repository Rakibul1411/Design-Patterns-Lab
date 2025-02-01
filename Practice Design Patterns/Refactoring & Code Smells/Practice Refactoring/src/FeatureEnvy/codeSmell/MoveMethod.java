package FeatureEnvy.codeSmell;

public class MoveMethod {
    public class Order {
        private double itemPrice;
        private int quantity;

        public double getItemPrice() {
            return itemPrice;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    public class Invoice {
        private Order order;

        public Invoice(Order order) {
            this.order = order;
        }

        public double calculateTotal() {
            return order.getItemPrice() * order.getQuantity(); // Uses Order's data heavily
        }
    }
}
