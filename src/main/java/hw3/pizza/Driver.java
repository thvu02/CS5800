package hw3.pizza;

import java.util.List;
import java.util.ArrayList;

public class Driver {
    public static void main(String args[]) {
        // Test 0: three pizzas one of each size 3, 6, and 9 toppings and eat() them
        Pizza smallPizza3Top = new Pizza.PizzaBuilder().setChainName("Pizza Hut").setSize("Small").setPepperoni(true).setExtraCheese(true).setHamAndPineapple(true).createPizza();
        smallPizza3Top.eat();

        Pizza medPizza6Top = new Pizza.PizzaBuilder().setChainName("Pizza Hut").setSize("Medium").setPepperoni(true).setExtraCheese(true).setHamAndPineapple(true)
                                                        .setSausage(true).setOnions(true).setBacon(true).createPizza();
        medPizza6Top.eat();

        Pizza largePizza9Top = new Pizza.PizzaBuilder().setChainName("Pizza Hut").setSize("Large").setPepperoni(true).setExtraCheese(true).setHamAndPineapple(true)
                                                        .setSausage(true).setOnions(true).setBacon(true)
                                                        .setOlives(true).setPesto(true).setHam(true).createPizza();
        largePizza9Top.eat();

        // Test 1: Pizza Hut; Large pizza with 3 toppings
        Pizza pizza1 = new Pizza.PizzaBuilder().setChainName("Pizza Hut").setSize("Large").setPepperoni(true).setExtraCheese(true).setHamAndPineapple(true).createPizza();
        pizza1.eat();

        // Test 2: Pizza Hut; Small pizza with 2 toppings
        Pizza pizza2 = new Pizza.PizzaBuilder().setChainName("Pizza Hut").setSize("Small").setTomatoAndBasil(true).setMushrooms(true).createPizza();
        pizza2.eat();

        // Test 3: Little Caesars; Medium pizza with 8 toppings
        Pizza pizza3 = new Pizza.PizzaBuilder().setChainName("Little Caesars").setSize("Medium").setSausage(true).setOnions(true).setBacon(true)
                                                .setOlives(true).setPesto(true).setHam(true).setPeppers(true).setSpinach(true).createPizza();
        pizza3.eat();

        // Test 4: Little Caesars; Small pizza with 6 toppings
        Pizza pizza4 = new Pizza.PizzaBuilder().setChainName("Little Caesars").setSize("Small").setSausage(true).setOnions(true)
                                                .setBacon(true).setOlives(true).setPesto(true).setHam(true).createPizza();
        pizza4.eat();

        // Test 5: Dominos; Small pizza with 1 topping
        Pizza pizza5 = new Pizza.PizzaBuilder().setChainName("Dominos").setSize("Small").setSpicyPork(true).createPizza();
        pizza5.eat();

        // Test 6: Dominos; Large pizza with 3 toppings
        Pizza pizza6 = new Pizza.PizzaBuilder().setChainName("Dominos").setSize("Large").setSpicyPork(true).setBeef(true).setPepperoni(true).createPizza();
        pizza6.eat();
    }
}
