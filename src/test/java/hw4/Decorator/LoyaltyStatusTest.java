package hw4.Decorator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoyaltyStatusTest {
    @Test
    public void totalCost_NoLoyatlyStatus() {
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus("invalid");
        double total = 500.00;
        assertEquals(500.00, loyaltyStatus.applyDiscount(total), 0.00);
    }

    @Test
    public void totalCost_LoyaltyStatusA() {
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus("A");
        double total = 500.00;
        assertEquals(500 * 0.50, loyaltyStatus.applyDiscount(total), 0.00);
    }

    @Test
    public void totalCost_LoyaltyStatusB() {
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus("B");
        double total = 500.00;
        assertEquals(500 * 0.75, loyaltyStatus.applyDiscount(total), 0.00);
    }

    @Test
    public void totalCost_LoyaltyStatusC() {
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus("C");
        double total = 500.00;
        assertEquals(500.00 * 0.90, loyaltyStatus.applyDiscount(total), 0.00);
    }

    @Test
    public void loyaltyStatusCorrectlySet() {
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus("A");
        assertEquals("A", loyaltyStatus.getStatus());
    }
}
