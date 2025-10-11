package hw4.Bridge;

public class MockNotificationChannel implements NotificationChannel {
    private String message = null;

    @Override
    public void sendNotification(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
