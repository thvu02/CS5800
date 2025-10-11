package hw4.Bridge;

public class PushChannel implements NotificationChannel {
    public void sendNotification(String message) {
        System.out.println("(sent via push) " + message);
    }
}
