package hw3.macronutrients;

import java.util.List;

public class FatsFactory extends MacroNutrientFactory {
    private final List<String> fatOptions = List.of("Peanuts", "Avocado", "Tuna", "Sour cream");
    private static FatsFactory fatsFactory = null;

    private FatsFactory() { }

    public static FatsFactory getInstance() {
        if (fatsFactory == null)
            fatsFactory = new FatsFactory();
        return fatsFactory;
    }

    @Override
    public String getMacroNutrient(String dietPlan) {
        switch (dietPlan) {
            case "No Restriction":
                return fatOptions.get((int) (Math.random() * 4));
            case "Paleo":
                return fatOptions.get((int) (Math.random() * 3));
            case "Vegan":
                return fatOptions.get((int) (Math.random() * 2));
            case "Nut Allergy":
                return fatOptions.get((int) (Math.random() * 3) + 1);
            default:
                throw new IllegalArgumentException("Diet plan is not valid: " + dietPlan);
        }
    }
}
