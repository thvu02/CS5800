package hw4.Decorator;

public class Cheese extends Toppings {
    public Cheese(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 1.00;
    }

    @Override
    public String getItem() {
        return foodItem.getItem() + " + Cheese";
    }
}
