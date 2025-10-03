package hw3.macronutrients;

import java.util.List;

public class CarbsFactory extends MacroNutrientFactory {
    private final List<String> carbOptions = List.of("Cheese", "Bread", "Lentils", "Pistachio");
    private static CarbsFactory carbsFactory = null;

    private CarbsFactory() { }

    public static CarbsFactory getInstance() {
        if (carbsFactory == null)
            carbsFactory = new CarbsFactory();
        return carbsFactory;
    }

    @Override
    public String getMacroNutrient(String dietPlan) {
        switch (dietPlan) {
            case "No Restriction":
                return carbOptions.get((int) (Math.random() * 4));
            case "Paleo":
                return carbOptions.get(3);
            case "Vegan":
                return carbOptions.get((int) (Math.random() * 3) + 1);
            case "Nut Allergy":
                return carbOptions.get((int) (Math.random() * 3));
            default:
                throw new IllegalArgumentException("Diet plan is not valid: " + dietPlan);
        }
    }
}
