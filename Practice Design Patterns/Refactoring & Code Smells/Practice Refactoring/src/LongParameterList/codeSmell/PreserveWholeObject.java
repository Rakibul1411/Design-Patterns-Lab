package LongParameterList.codeSmell;

public class PreserveWholeObject {
    public void calculateDiscount(String customerName, boolean isPremium, double orderTotal) {
        if (isPremium) {
            System.out.println(customerName + " gets a discount on $" + orderTotal);
        } else {
            System.out.println(customerName + " does not get a discount.");
        }
    }
}
