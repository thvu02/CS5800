package hw3.pizza;

import java.util.List;
import java.util.ArrayList;

public class Driver {
    public static void main(String args[]) {
        // Test 1: Pizza Hut; Large pizza with 3 toppings
        Pizza pizza1 = new Pizza.PizzaBuilder().setChainName("Pizza Hut").setSize("Large").setPepperoni(true).setExtraCheese(true).setHamAndPineapple(true).createPizza();
        pizza1.eat();

        // Test 2: Pizza Hut; Small pizza with 2 toppings
        Pizza pizza2 = new Pizza.PizzaBuilder().setChainName("Pizza Hut").setSize("Small").setTomatoAndBasil(true).setMushrooms(true).createPizza();
        pizza2.eat();

        // Test 3: Little Caesars; Medium pizza with 8 toppings
        try {
            Pizza pizza3 = new Pizza.PizzaBuilder().setChainName("Little Caesars").setSize("Medium").setSausage(true).setOnions(true).setBacon(true)
                                                    .setOlives(true).setPesto(true).setHam(true).setPeppers(true).setSpinach(true).createPizza();
            System.out.println("This line will NOT be reached");
            pizza3.eat();
        }
        catch (IllegalStateException e) {
            System.err.println(e);
        }

        // Test 4: Little Caesars; Small pizza with 6 toppings
        try {
            Pizza pizza4 = new Pizza.PizzaBuilder().setChainName("Little Caesars").setSize("Small").setSausage(true).setOnions(true)
                                                    .setBacon(true).setOlives(true).setPesto(true).setHam(true).createPizza();
            System.out.println("This line will NOT be reached");
            pizza4.eat();
        }
        catch (IllegalStateException e) {
            System.err.println(e);
        }

        // Test 5: Dominos; Small pizza with 1 topping
        Pizza pizza5 = new Pizza.PizzaBuilder().setChainName("Dominos").setSize("Small").setSpicyPork(true).createPizza();
        pizza5.eat();

        // Test 6: Dominos; Large pizza with 3 toppings
        Pizza pizza6 = new Pizza.PizzaBuilder().setChainName("Dominos").setSize("Large").setSpicyPork(true).setBeef(true).setPepperoni(true).createPizza();
        pizza6.eat();
    }
}
