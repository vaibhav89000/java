// “In the first design, the base Payment class promised refund support, 
// but CashPayment could not honor it, violating Liskov Substitution Principle.
// By separating refund capability into a RefundablePayment interface, 
// each payment method now only implements what it supports, ensuring safe substitution.”

class Payment {
    void pay(double amount) {
        System.out.println("Processing payment of " + amount);
    }

    void refund(double amount) {
        System.out.println("Refunding " + amount);
    }
}

class CreditCardPayment extends Payment {
}

class CashPayment extends Payment {
    @Override
    void refund(double amount) {
        throw new UnsupportedOperationException("Cash refund not supported");
    }
}

public class LSPViolation {
    public static void main(String[] args) {
        Payment payment = new CashPayment(); // Substitution
        payment.pay(500);
        payment.refund(500); // ❌ Runtime failure
    }
}
