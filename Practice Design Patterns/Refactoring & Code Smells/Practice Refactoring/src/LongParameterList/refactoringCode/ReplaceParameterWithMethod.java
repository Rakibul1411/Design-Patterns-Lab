package LongParameterList.refactoringCode;

public class ReplaceParameterWithMethod {
    public void printCustomerDetails(Customer customer) {
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
    }
}



public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
}
