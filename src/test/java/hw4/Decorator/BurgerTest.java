package hw4.Decorator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BurgerTest {
    @Test
    public void CreateBurger() {
        FoodItem burger = new Burger();

        assertEquals(5.00, burger.getCost(), 0.00);
        assertEquals("Burger", burger.getItem());
    }

    @Test
    public void CreateBurgerWithToppings() {
        FoodItem burger = new Burger();
        burger = new Cheese(burger);

        assertEquals(6.00, burger.getCost(), 0.00);
        assertEquals("Burger + Cheese", burger.getItem());
    }
}
