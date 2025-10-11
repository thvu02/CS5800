package hw4.Decorator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HotDogTest {
    @Test
    public void CreateHotDog() {
        FoodItem hotDog = new HotDog();

        assertEquals(1.50, hotDog.getCost(), 0.00);
        assertEquals("HotDog", hotDog.getItem());
    }

    @Test
    public void CreateHotDogWithToppings() {
        FoodItem hotDog = new HotDog();
        hotDog = new Ketchup(hotDog);
        hotDog = new Onions(hotDog);

        assertEquals(2.75, hotDog.getCost(), 0.00);
        assertEquals("HotDog + Ketchup + Onions", hotDog.getItem());
    }
}
