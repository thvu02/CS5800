package hw4.Decorator;

public class Fries implements FoodItem {
    @Override
    public double getCost() {
        return 2.50;
    }

    @Override
    public String getItem() {
        return "Fries";
    }
}
