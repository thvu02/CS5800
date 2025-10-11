package hw4.Decorator;

public class Burger implements FoodItem {
    @Override
    public double getCost() {
        return 5.00;
    }

    @Override
    public String getItem() {
        return "Burger";
    }
}
