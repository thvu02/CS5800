package hw3.pizza;

public class Pizza {
    private String chainName;
    private String size;
    private boolean pepperoni;
    private boolean sausage;
    private boolean mushrooms;
    private boolean bacon;
    private boolean onions;
    private boolean extraCheese;
    private boolean peppers;
    private boolean chicken;
    private boolean olives;
    private boolean spinach;
    private boolean tomatoAndBasil;
    private boolean beef;
    private boolean ham;
    private boolean pesto;
    private boolean spicyPork;
    private boolean hamAndPineapple;

    private Pizza(String chainName, String size, boolean pepperoni, boolean sausage, boolean mushrooms,
                  boolean bacon, boolean onions, boolean extraCheese, boolean peppers, boolean chicken,
                  boolean olives, boolean spinach, boolean tomatoAndBasil, boolean beef, boolean ham,
                  boolean pesto, boolean spicyPork, boolean hamAndPineapple) {
        this.chainName = chainName;
        this.size = size;
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
        this.bacon = bacon;
        this.onions = onions;
        this.extraCheese = extraCheese;
        this.peppers = peppers;
        this.chicken = chicken;
        this.olives = olives;
        this.spinach = spinach;
        this.tomatoAndBasil = tomatoAndBasil;
        this.beef = beef;
        this.ham = ham;
        this.pesto = pesto;
        this.spicyPork = spicyPork;
        this.hamAndPineapple = hamAndPineapple;
    }

    // Output pizza chain, pizza size, and toppings of pizza
    public void eat() {
        String result = chainName + " " + size + " pizza with " + countToppings() + " toppings (";

        if (pepperoni) result += "Pepperoni, ";
        if (sausage) result += "Sausage, ";
        if (mushrooms) result += "Mushrooms, ";
        if (bacon) result += "Bacon, ";
        if (onions) result += "Onions, ";
        if (extraCheese) result += "Extra cheese, ";
        if (peppers) result += "Peppers, ";
        if (chicken) result += "Chicken, ";
        if (olives) result += "Olives, ";
        if (spinach) result += "Spinach, ";
        if (tomatoAndBasil) result += "Tomato and basil, ";
        if (beef) result += "Beef, ";
        if (ham) result += "Ham, ";
        if (pesto) result += "Pesto, ";
        if (spicyPork) result += "Spicy pork, ";
        if (hamAndPineapple) result += "Ham and pineapple, ";

        // trim hanging comma if present
        if (result.endsWith(", ")) {
            result = result.substring(0, result.length() - 2);
        }

        result += ")";

        System.out.println(result);
    }

    private int countToppings() {
        int toppingCount = 0;

        if (pepperoni) toppingCount++;
        if (sausage) toppingCount++;
        if (mushrooms) toppingCount++;
        if (bacon) toppingCount++;
        if (onions) toppingCount++;
        if (extraCheese) toppingCount++;
        if (peppers) toppingCount++;
        if (chicken) toppingCount++;
        if (olives) toppingCount++;
        if (spinach) toppingCount++;
        if (tomatoAndBasil) toppingCount++;
        if (beef) toppingCount++;
        if (ham) toppingCount++;
        if (pesto) toppingCount++;
        if (spicyPork) toppingCount++;
        if (hamAndPineapple) toppingCount++;

        return toppingCount;
    }

    public static class PizzaBuilder {
        private String chainName;
        private String size;
        private boolean pepperoni = false;
        private boolean sausage = false;
        private boolean mushrooms = false;
        private boolean bacon = false;
        private boolean onions = false;
        private boolean extraCheese = false;
        private boolean peppers = false;
        private boolean chicken = false;
        private boolean olives = false;
        private boolean spinach = false;
        private boolean tomatoAndBasil = false;
        private boolean beef = false;
        private boolean ham = false;
        private boolean pesto = false;
        private boolean spicyPork = false;
        private boolean hamAndPineapple = false;

        public PizzaBuilder setChainName(String chainName) {
            this.chainName = chainName;
            return this;
        }

        public PizzaBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public PizzaBuilder setPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder setSausage(boolean sausage) {
            this.sausage = sausage;
            return this;
        }

        public PizzaBuilder setMushrooms(boolean mushrooms) {
            this.mushrooms = mushrooms;
            return this;
        }

        public PizzaBuilder setBacon(boolean bacon) {
            this.bacon = bacon;
            return this;
        }

        public PizzaBuilder setOnions(boolean onions) {
            this.onions = onions;
            return this;
        }

        public PizzaBuilder setExtraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public PizzaBuilder setPeppers(boolean peppers) {
            this.peppers = peppers;
            return this;
        }

        public PizzaBuilder setChicken(boolean chicken) {
            this.chicken = chicken;
            return this;
        }

        public PizzaBuilder setOlives(boolean olives) {
            this.olives = olives;
            return this;
        }

        public PizzaBuilder setSpinach(boolean spinach) {
            this.spinach = spinach;
            return this;
        }

        public PizzaBuilder setTomatoAndBasil(boolean tomatoAndBasil) {
            this.tomatoAndBasil = tomatoAndBasil;
            return this;
        }

        public PizzaBuilder setBeef(boolean beef) {
            this.beef = beef;
            return this;
        }

        public PizzaBuilder setHam(boolean ham) {
            this.ham = ham;
            return this;
        }

        public PizzaBuilder setPesto(boolean pesto) {
            this.pesto = pesto;
            return this;
        }

        public PizzaBuilder setSpicyPork(boolean spicyPork) {
            this.spicyPork = spicyPork;
            return this;
        }

        public PizzaBuilder setHamAndPineapple(boolean hamAndPineapple) {
            this.hamAndPineapple = hamAndPineapple;
            return this;
        }

        public Pizza createPizza() {
            if (chainName == null) {
                throw new IllegalStateException("Chain name must be set");
            }

            if (size == null) {
                throw new IllegalStateException("Pizza size must be set to Small, Medium, or Large");
            }

            return new Pizza(chainName, size, pepperoni, sausage, mushrooms, bacon, onions,
                                extraCheese, peppers, chicken, olives, spinach, tomatoAndBasil,
                                beef, ham, pesto, spicyPork, hamAndPineapple);
        }

        private int countToppings() {
            int toppingCount = 0;

            if (pepperoni) toppingCount++;
            if (sausage) toppingCount++;
            if (mushrooms) toppingCount++;
            if (bacon) toppingCount++;
            if (onions) toppingCount++;
            if (extraCheese) toppingCount++;
            if (peppers) toppingCount++;
            if (chicken) toppingCount++;
            if (olives) toppingCount++;
            if (spinach) toppingCount++;
            if (tomatoAndBasil) toppingCount++;
            if (beef) toppingCount++;
            if (ham) toppingCount++;
            if (pesto) toppingCount++;
            if (spicyPork) toppingCount++;
            if (hamAndPineapple) toppingCount++;

            return toppingCount;
        }
    }
}
