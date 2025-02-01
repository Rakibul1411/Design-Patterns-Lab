package SpeculativeGenerality.refactoringCode;

public class RemoveParameter {
    public class DiscountCalculator {
        public double calculateDiscount(double total) {
            if (total > 100) {
                return total * 0.1;
            }
            return 0;
        }
    }
}
