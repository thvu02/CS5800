package hw4.Decorator;

public class HotDog implements FoodItem {
    @Override
    public double getCost() {
        return 1.50;
    }

    @Override
    public String getItem() {
        return "HotDog";
    }
}
