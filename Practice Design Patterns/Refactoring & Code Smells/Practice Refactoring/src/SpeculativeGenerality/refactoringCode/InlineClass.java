package SpeculativeGenerality.refactoringCode;

public class InlineClass {
    public class Customer {
        private String street;
        private String city;

        public Customer(String street, String city) {
            this.street = street;
            this.city = city;
        }

        public String getCustomerAddress() {
            return street + ", " + city;
        }
    }
}
