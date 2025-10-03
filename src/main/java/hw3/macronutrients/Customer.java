package hw3.macronutrients;

import java.util.List;

public class Customer {
    private String name;
    private String dietPlan;

    public Customer(String name, String dietPlan) {
        List<String> validDietPlans = List.of("No Restriction", "Paleo", "Vegan", "Nut Allergy");
        if (! validDietPlans.contains(dietPlan))
            throw new IllegalArgumentException("Provided diet plan (case sensitive) is not valid: " + dietPlan);

        this.name = name;
        this.dietPlan = dietPlan;
    }

    public String getName() { return name; }
    public String getDietPlan() { return dietPlan; }

    public void setName(String name) { this.name = name; }
    public void setDietPlan(String dietPlan) { this.dietPlan = dietPlan; }
}
