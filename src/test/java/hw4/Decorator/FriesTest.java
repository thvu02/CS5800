package hw4.Decorator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FriesTest {
    @Test
    public void CreateFries() {
        FoodItem fries = new Fries();

        assertEquals(2.50, fries.getCost(), 0.00);
        assertEquals("Fries", fries.getItem());
    }

    @Test
    public void CreateFriesWithToppings() {
        FoodItem fries = new Fries();
        fries = new Ketchup(fries);
        fries = new Cheese(fries);

        assertEquals(4.25, fries.getCost(), 0.00);
        assertEquals("Fries + Ketchup + Cheese", fries.getItem());
    }
}
