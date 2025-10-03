package hw3.macronutrients;

import java.util.List;

public class ProteinFactory extends MacroNutrientFactory {
    private final List<String> proteinOptions = List.of("Fish", "Chicken", "Beef", "Tofu");
    private static ProteinFactory proteinFactory = null;

    private ProteinFactory() { }

    public static ProteinFactory getInstance() {
        if (proteinFactory == null)
            proteinFactory = new ProteinFactory();
        return proteinFactory;
    }

    @Override
    public String getMacroNutrient(String dietPlan) {
        switch (dietPlan) {
            case "No Restriction":
            case "Nut Allergy":
                return proteinOptions.get((int) (Math.random() * 4));
            case "Paleo":
                return proteinOptions.get((int) (Math.random() * 3));
            case "Vegan":
                return proteinOptions.get(3);
            default:
                throw new IllegalArgumentException("Diet plan is not valid: " + dietPlan);
        }
    }
}
