package hw4.Bridge;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashOnDeliveryPaymentTest {
    @Test
    public void CashOnDeliveryPayment_SendsCorrectMessage() {
        MockNotificationChannel channel = new MockNotificationChannel();
        PaymentNotification cashOnDeliveryPayment = new CashOnDeliveryPayment(channel);
        cashOnDeliveryPayment.notifyCustomer();
        assertEquals("Cash on delivery payment notification successful.", channel.getMessage());
    }
}
