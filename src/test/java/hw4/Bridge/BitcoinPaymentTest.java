package hw4.Bridge;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BitcoinPaymentTest {
    @Test
    public void BitcoinPayment_SendsCorrectMessage() {
        MockNotificationChannel channel = new MockNotificationChannel();
        PaymentNotification bitcoinPayment = new BitcoinPayment(channel);
        bitcoinPayment.notifyCustomer();
        assertEquals("Bitcoin payment notification successful.", channel.getMessage());
    }
}
