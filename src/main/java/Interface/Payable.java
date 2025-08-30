package Interface;

public interface Payable {
    double calculatePayment(); // returns the amount to be paid this period
    String getPayeeName(); // returns the name of the person or entity being paid
}
