package Interface;

public class Vendor implements Payable {
    private String vendorName;
    private String invoiceNumber;
    private Double amountDue;

    // constructor
    public Vendor(String vendorName, String invoiceNumber, Double amountDue) {
        this.vendorName = vendorName;
        this.invoiceNumber = invoiceNumber;
        this.amountDue = amountDue;
    }

    // empty constructor
    public Vendor() {
        this.vendorName = "";
        this.invoiceNumber = "";
        this.amountDue = 0.0;
    }

    // getters
    public String getVendorName() { return vendorName; }
    public String getInvoiceNumber() { return invoiceNumber; }
    public double getAmountDue() { return amountDue; }

    // setters
    public void setVendorName(String vendorName) { this.vendorName = vendorName; }
    public void setInvoiceNumber(String invoiceNumber) { this.invoiceNumber = invoiceNumber; }
    public void setAmountDue(double amountDue) {
        if (amountDue >= 0) {
            this.amountDue = amountDue;
        }
        else {
            System.out.println("Amount due must be non-negative: " + amountDue);
        }
    }

    // interface method definitions
    public double calculatePayment() { return getAmountDue(); }
    public String getPayeeName() { return getVendorName(); }

    // class methods
    public void print() {
        System.out.println("Vendor: " + getVendorName());
        System.out.println("Invoice Number: " + getInvoiceNumber());
        System.out.println("Calculated Payment: " + calculatePayment());
    }
}
