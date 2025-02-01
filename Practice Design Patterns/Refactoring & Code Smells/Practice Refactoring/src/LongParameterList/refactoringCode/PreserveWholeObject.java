package LongParameterList.refactoringCode;

public class PreserveWholeObject {
    public void calculateDiscount(Customer customer, Order order) {
        if (customer.isPremium()) {
            System.out.println(customer.getName() + " gets a discount on $" + order.getTotal());
        } else {
            System.out.println(customer.getName() + " does not get a discount.");
        }
    }
}
