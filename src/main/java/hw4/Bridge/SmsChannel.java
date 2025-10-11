package hw4.Bridge;

public class SmsChannel implements NotificationChannel {
    public void sendNotification(String message) {
        System.out.println("(sent via sms) " + message);
    }
}
