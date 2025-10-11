package hw4.Bridge;

public class OnlinePaymentNotification extends PaymentNotification {
    public OnlinePaymentNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void notifyCustomer() {
        channel.sendNotification("Online payment notification successful.");
    }
}
