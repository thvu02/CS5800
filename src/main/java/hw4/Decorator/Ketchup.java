package hw4.Decorator;

public class Ketchup extends Toppings {
    public Ketchup(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 0.75;
    }

    @Override
    public String getItem() {
        return foodItem.getItem() + " + Ketchup";
    }
}
