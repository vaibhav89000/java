interface PaymentGateway {
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class PayPalPayment implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal");
    }
}

public class InterfaceAbstraction {
    public static void main(String[] args) {
        PaymentGateway payment = new CreditCardPayment();
        payment.processPayment(2000.0); // Paid ₹2000.0 using Credit Card

        payment = new PayPalPayment();
        payment.processPayment(500.0);  // Paid ₹500.0 using PayPal
    }
}
