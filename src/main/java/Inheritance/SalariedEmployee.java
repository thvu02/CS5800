package Inheritance;

public class SalariedEmployee extends Employee {
    private int weeklySalary;

    // constructor
    public SalariedEmployee(String firstName, String lastName, String ssn, int weeklySalary) {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

    // empty constructor
    public SalariedEmployee() {
        this.weeklySalary = 0;
    }

    // getters
    public int getWeeklySalary() { return weeklySalary; }

    // setters
    public void setWeeklySalary(int weeklySalary) { this.weeklySalary = weeklySalary; }
}
