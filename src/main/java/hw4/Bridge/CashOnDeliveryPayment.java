package hw4.Bridge;

public class CashOnDeliveryPayment extends PaymentNotification {
    public CashOnDeliveryPayment(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void notifyCustomer() {
        channel.sendNotification("Cash on delivery payment notification successful.");
    }
}
