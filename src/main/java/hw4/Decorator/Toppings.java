package hw4.Decorator;

public abstract class Toppings implements FoodItem {
    protected FoodItem foodItem;

    public Toppings(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public abstract double getCost();

    @Override
    public abstract String getItem();
}
