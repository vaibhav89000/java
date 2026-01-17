// “Earlier, Invoice had multiple responsibilities like calculation, persistence, and printing.
// By separating them into different classes, each class now has only one reason to change, which follows the Single Responsibility Principle.”

class Invoice {
    private int amount;

    public Invoice(int amount) {
        this.amount = amount;
    }

    public int calculateTotal() {
        return amount + 100; // tax
    }

    public void saveToDatabase() {
        System.out.println("Saving invoice to DB");
    }

    public void printInvoice() {
        System.out.println("Invoice total: " + calculateTotal());
    }
}

public class SRPViolation {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1000);
        invoice.printInvoice();
        invoice.saveToDatabase();
    }
}
