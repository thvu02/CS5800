package hw4.Decorator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderTest {
    private final Order order = new Order();

    @Before
    public void setup() {
        FoodItem burger = new Burger();
        burger = new Cheese(burger);
        burger = new Onions(burger);

        FoodItem fries = new Fries();
        fries = new Ketchup(fries);

        order.addFoodItem(burger);
        order.addFoodItem(fries);
    }

    @Test
    public void CalculateCorrectTotal() {
        double expectedCost = 5.00 + 1.00 + 0.50 + 2.50 + 0.75;
        assertEquals(expectedCost, order.getTotalCost(), 0.00);
    }

    @Test
    public void RecordCorrectOrder() {
        String orderDetails = order.toString();
        double expectedCost = 5.00 + 1.00 + 0.50 + 2.50 + 0.75;
        assertTrue(orderDetails.contains("Burger + Cheese + Onions"));
        assertTrue(orderDetails.contains("Fries + Ketchup"));
        assertTrue(orderDetails.contains(Double.toString(expectedCost)));
    }
}
