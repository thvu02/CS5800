package hw1.Inheritance;

public class CommissionEmployee extends Employee {
    private double commissionRate;
    private int grossSalary;

    // constructor
    public CommissionEmployee(String firstName, String lastName, String ssn, double commissionRate, int grossSalary) {
        super(firstName, lastName, ssn);
        this.commissionRate = commissionRate;
        this.grossSalary = grossSalary;
    }

    // empty constructor
    public CommissionEmployee() {
        this.commissionRate = 0.0;
        this.grossSalary = 0;
    }

    // getters
    public double getCommissionRate() { return commissionRate; }
    public int getGrossSalary() { return grossSalary; }

    // setters
    public void setCommissionRate(int commissionRate) { this.commissionRate = commissionRate; }
    public void setGrossSalary(int grossSalary) { this.grossSalary = grossSalary; }
}
