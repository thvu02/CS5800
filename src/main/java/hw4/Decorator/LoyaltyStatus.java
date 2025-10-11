package hw4.Decorator;

public class LoyaltyStatus {
    private String status;

    public LoyaltyStatus(String status) {
        this.status = status;
    }

    public double applyDiscount(double totalCost) {
        switch (status) {
            case "A":
                return (double) Math.round(totalCost * 0.50 * 100) / 100;
            case "B":
                return (double) Math.round(totalCost * 0.75 * 100) / 100;
            case "C":
                return (double) Math.round(totalCost * 0.90 * 100) / 100;
            default:
                return totalCost;
        }
    }

    public String getStatus() {
        return status;
    }
}