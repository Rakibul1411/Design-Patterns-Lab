package InappropriateNaming.codeSmell;

public class X {
    public void doIt(O o) {
        if (o.t < 0) {
            throw new IllegalArgumentException("Invalid order total");
        }
        if (o.i.isEmpty()) {
            throw new IllegalArgumentException("No items in the order");
        }

        if (o.c.p) {
            o.t *= 0.9;
        }

        if (o.t > 100) {
            o.s = 0;
        } else {
            o.s = 10;
        }

        if (o.pm == "cc") {
            System.out.println("Processing credit card...");
        } else if (o.pm == "pp") {
            System.out.println("Processing PayPal...");
        } else {
            throw new IllegalArgumentException("Invalid payment method");
        }

        System.out.println("Email Sent!");
    }
}
