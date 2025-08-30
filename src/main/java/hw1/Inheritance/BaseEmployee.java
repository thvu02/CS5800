package hw1.Inheritance;

public class BaseEmployee extends Employee {
    private int baseSalary;

    // constructor
    public BaseEmployee(String firstName, String lastName, String ssn, int baseSalary) {
        super(firstName, lastName, ssn);
        this.baseSalary = baseSalary;
    }

    // empty constructor
    public BaseEmployee() {
        this.baseSalary = 0;
    }

    // getters
    public int getBaseSalary() { return baseSalary; }

    // setters
    public void setBaseSalary(int baseSalary) { this.baseSalary = baseSalary; }
}
