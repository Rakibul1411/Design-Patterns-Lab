package LongMethod.codeSmell;

/*
 Code Smell:
 Only some fields of an object are passed to a method,
 causing 'unnecessary fragmentation'.
 */
public class PreserveWholeObject {
    public void calculateShipping(double total, Customer customer) {
        double shipping = total > 100 ? 0 : 10;
        System.out.println("Shipping for customer " + customer.getName() + ": $" + shipping);
    }
}
