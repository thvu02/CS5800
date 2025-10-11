package hw4.Bridge;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OnlinePaymentNotificationTest {
    @Test
    public void OnlinePaymentNotification_SendsCorrectMessage() {
        MockNotificationChannel channel = new MockNotificationChannel();
        PaymentNotification onlinePaymentNotification = new OnlinePaymentNotification(channel);
        onlinePaymentNotification.notifyCustomer();
        assertEquals("Online payment notification successful.", channel.getMessage());
    }
}
