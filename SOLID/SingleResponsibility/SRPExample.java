class Invoice {
    private int amount;

    public Invoice(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

class InvoiceCalculator {
    public int calculateTotal(Invoice invoice) {
        return invoice.getAmount() + 100; // tax
    }
}

class InvoiceRepository {
    public void save(Invoice invoice) {
        System.out.println("Invoice saved to DB");
    }
}

class InvoicePrinter {
    public void print(Invoice invoice, int total) {
        System.out.println("Invoice total: " + total);
    }
}

public class SRPExample {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1000);

        InvoiceCalculator calculator = new InvoiceCalculator();
        int total = calculator.calculateTotal(invoice);

        InvoicePrinter printer = new InvoicePrinter();
        printer.print(invoice, total);

        InvoiceRepository repo = new InvoiceRepository();
        repo.save(invoice);
    }
}
