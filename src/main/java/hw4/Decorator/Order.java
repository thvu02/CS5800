package hw4.Decorator;

import java.util.List;
import java.util.ArrayList;

public class Order {
    private final List<FoodItem> foodItems = new ArrayList<FoodItem>();

    public void addFoodItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (FoodItem foodItem : foodItems) {
            totalCost += foodItem.getCost();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Your order:\n");
        for (FoodItem foodItem : foodItems) {
            builder.append("  -" + foodItem.getItem() + " ($" + foodItem.getCost() + ")\n");
        }
        builder.append("Total cost: $" + getTotalCost() + "\n");
        return builder.toString();
    }
}
