package hw4.Bridge;

public class EmailChannel implements NotificationChannel {
    public void sendNotification(String message) {
        System.out.println("(sent via email) " + message);
    }
}
