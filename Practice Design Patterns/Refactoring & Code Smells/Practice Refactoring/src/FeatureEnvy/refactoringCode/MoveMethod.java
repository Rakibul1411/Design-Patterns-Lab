package FeatureEnvy.refactoringCode;

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

        public double calculateTotal() {
            return itemPrice * quantity;
        }
    }

    public class Invoice {
        private Order order;

        public Invoice(Order order) {
            this.order = order;
        }

        public double getTotal() {
            return order.calculateTotal();
        }
    }
}
