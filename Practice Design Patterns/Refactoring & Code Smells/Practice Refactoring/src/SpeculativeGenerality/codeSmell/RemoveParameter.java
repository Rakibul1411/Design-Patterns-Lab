package SpeculativeGenerality.codeSmell;

/*
Code Smell:-
A method takes parameters that are either unused or
serve no real purpose.
*/
public class RemoveParameter {
    public class DiscountCalculator {
        public double calculateDiscount(double total, boolean isHoliday) {
            if (total > 100) {
                return total * 0.1; // Holiday parameter is not used
            }
            return 0;
        }
    }
}
