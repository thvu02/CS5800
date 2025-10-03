package hw3.macronutrients;

public class MacroNutrientFactoryProducer {
    public static MacroNutrientFactory createMacroNutrientFactory(String macroNutrientType) {
        switch (macroNutrientType) {
            case "Carbs":
                return CarbsFactory.getInstance();
            case "Protein":
                return ProteinFactory.getInstance();
            case "Fats":
                return FatsFactory.getInstance();
            default:
                throw new IllegalArgumentException("Macronutrient food option is not valid: " + macroNutrientType);
        }
    }
}
