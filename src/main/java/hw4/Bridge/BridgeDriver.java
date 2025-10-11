package hw4.Bridge;

public class BridgeDriver {
    public static void main(String[] args) {
        // scenario 1: online and email
        PaymentNotification onlineAndEmail = new OnlinePaymentNotification(new EmailChannel());
        onlineAndEmail.notifyCustomer();

        // scenario 2: online and sms
        PaymentNotification onlineAndSms = new OnlinePaymentNotification(new SmsChannel());
        onlineAndSms.notifyCustomer();

        // scenario 3: cash and email
        PaymentNotification cashAndEmail = new CashOnDeliveryPayment(new EmailChannel());
        cashAndEmail.notifyCustomer();

        // scenario 4: cash and sms
        PaymentNotification cashAndSms = new CashOnDeliveryPayment(new SmsChannel());
        cashAndSms.notifyCustomer();

        // scenario 5: bitcoin and email
        PaymentNotification bitcoinAndEmail = new BitcoinPayment(new EmailChannel());
        bitcoinAndEmail.notifyCustomer();

        // scenario 6: bitcoin and sms
        PaymentNotification bitcoinAndSms = new BitcoinPayment(new SmsChannel());
        bitcoinAndSms.notifyCustomer();

        // scenario 7: online and push
        PaymentNotification onlineAndPush = new OnlinePaymentNotification(new PushChannel());
        onlineAndPush.notifyCustomer();

        // scenario 8: bitcoin and push
        PaymentNotification bitcoinAndPush = new BitcoinPayment(new PushChannel());
        bitcoinAndPush.notifyCustomer();
    }
}
