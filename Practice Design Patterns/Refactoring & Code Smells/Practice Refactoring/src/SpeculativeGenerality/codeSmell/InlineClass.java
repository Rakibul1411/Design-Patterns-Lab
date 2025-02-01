package SpeculativeGenerality.codeSmell;

/*
Code Smell:-
A class exists but is only used by another class and does
not have its own distinct responsibility.
*/
public class InlineClass {
    public class Address {
        private String street;
        private String city;

        public Address(String street, String city) {
            this.street = street;
            this.city = city;
        }

        public String getFullAddress() {
            return street + ", " + city;
        }
    }

    public class Customer {
        private Address address;

        public Customer(Address address) {
            this.address = address;
        }

        public String getCustomerAddress() {
            return address.getFullAddress();
        }
    }
}
