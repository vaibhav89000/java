interface Payment {
    void pay(double amount);
}

interface RefundablePayment {
    void refund(double amount);
}

class CreditCardPayment implements Payment, RefundablePayment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }

    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to Credit Card");
    }
}

class CashPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash");
    }
}

public class LSPExample {
    public static void main(String[] args) {
        Payment cash = new CashPayment();
        cash.pay(500);

        Payment card = new CreditCardPayment();
        card.pay(1000);

        RefundablePayment refundable = new CreditCardPayment();
        refundable.refund(1000);
    }
}
