package hw3.macronutrients;

public class Meal {
    private final String carb;
    private final String protein;
    private final String fat;

    public Meal(String carb, String protein, String fat) {
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Carb: " + carb + ", Protein: " + protein + ", Fat: " + fat;
    }
}
