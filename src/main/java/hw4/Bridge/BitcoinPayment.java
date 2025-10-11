package hw4.Bridge;

public class BitcoinPayment extends PaymentNotification {
    public BitcoinPayment(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void notifyCustomer() {
        channel.sendNotification("Bitcoin payment notification successful.");
    }
}
