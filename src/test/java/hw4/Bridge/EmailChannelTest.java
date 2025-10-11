package hw4.Bridge;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EmailChannelTest {
    // SOURCE: https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
    // trim system output due to Linux and Windows line separator differences (\n vs \r\n)
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setupStreams() {
        System.setOut(new PrintStream(output));
    }

    @After
    public void cleanupStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void EmailChannel_SendsCorrectMessage() {
        PaymentNotification cashAndEmail = new CashOnDeliveryPayment(new EmailChannel());
        cashAndEmail.notifyCustomer();
        assertEquals("(sent via email) Cash on delivery payment notification successful.", output.toString().trim());
    }
}
