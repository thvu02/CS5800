package hw4.Decorator;

public class Onions extends Toppings {
    public Onions(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 0.50;
    }

    @Override
    public String getItem() {
        return foodItem.getItem() + " + Onions";
    }
}
