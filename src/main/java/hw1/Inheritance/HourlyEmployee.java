package hw1.Inheritance;

public class HourlyEmployee extends Employee {
    private int wage;
    private int hoursWorked;

    // constructor
    public HourlyEmployee(String firstName, String lastName, String ssn, int wage, int hoursWorked) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    // empty constructor
    public HourlyEmployee() {
        this.wage = 0;
        this.hoursWorked = 0;
    }

    // getters
    public int getWage() { return wage; }
    public int getHoursWorked() { return hoursWorked; }

    // setters
    public void setWage(int wage) { this.wage = wage; }
    public void setHoursWorked(int hoursWorked) { this.hoursWorked = hoursWorked; }
}
