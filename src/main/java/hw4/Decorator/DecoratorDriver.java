package hw4.Decorator;

public class DecoratorDriver {
    public static void main(String[] args) {
        FoodItem burger = new Burger();
        burger = new Cheese(burger);

        FoodItem fries = new Fries();

        FoodItem hotDog = new HotDog();
        hotDog = new Ketchup(hotDog);
        hotDog = new Onions(hotDog);

        Order order = new Order();
        order.addFoodItem(burger);
        order.addFoodItem(fries);
        order.addFoodItem(hotDog);

        double totalCost = order.getTotalCost();
        String orderString = order.toString();
        System.out.println(orderString);

        LoyaltyStatus loyaltyStatusA = new LoyaltyStatus("A");
        double discountA = loyaltyStatusA.applyDiscount(totalCost);
        System.out.println("Cost after discount " + loyaltyStatusA.getStatus() + " : $" + discountA);

        LoyaltyStatus loyaltyStatusB = new LoyaltyStatus("B");
        double discountB = loyaltyStatusB.applyDiscount(totalCost);
        System.out.println("Cost after discount " + loyaltyStatusB.getStatus() + " : $" + discountB);

        LoyaltyStatus loyaltyStatusC = new LoyaltyStatus("C");
        double discountC = loyaltyStatusC.applyDiscount(totalCost);
        System.out.println("Cost after discount " + loyaltyStatusC.getStatus() + " : $" + discountC);
    }
}
