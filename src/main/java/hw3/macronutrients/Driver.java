package hw3.macronutrients;

public class Driver {
    public static void main(String[] args) {
        Customer trung = new Customer("Trung", "No Restriction");
        createMeal(trung);

        Customer sri = new Customer("Sri", "Paleo");
        createMeal(sri);

        Customer anoushka = new Customer("Anoushka", "Paleo");
        createMeal(anoushka);

        Customer tommy = new Customer("Tommy", "Vegan");
        createMeal(tommy);

        Customer peter = new Customer("Peter", "Vegan");
        createMeal(peter);

        Customer nima = new Customer("Nima", "Nut Allergy");
        createMeal(nima);
    }

    private static void createMeal(Customer customer) {
        MacroNutrientFactory carbFactory = MacroNutrientFactoryProducer.createMacroNutrientFactory("Carbs");
        MacroNutrientFactory proteinFactory = MacroNutrientFactoryProducer.createMacroNutrientFactory("Protein");
        MacroNutrientFactory fatsFactory = MacroNutrientFactoryProducer.createMacroNutrientFactory("Fats");

        String dietPlan = customer.getDietPlan();
        String carb = carbFactory.getMacroNutrient(dietPlan);
        String protein = proteinFactory.getMacroNutrient(dietPlan);
        String fat = fatsFactory.getMacroNutrient(dietPlan);

        Meal meal = new Meal(carb, protein, fat);
        System.out.println("Customer (" + customer.getName() + ") with diet plan (" + dietPlan + ")");
        System.out.println(meal + "\n");
    }
}
