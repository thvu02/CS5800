package Interface;
import java.lang.Math;

public class Freelancer implements Payable {
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;

    // constructor
    public Freelancer(String firstName, String lastName, double hourlyRate, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // empty constructor
    public Freelancer() {
        this.firstName = "";
        this.lastName = "";
        this.hourlyRate = 0.0;
        this.hoursWorked = 0.0;
    }

    // getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; };
    public double getHourlyRate() { return hourlyRate; }
    public double getHoursWorked() { return hoursWorked; }

    // setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
        }
        else {
            System.out.println("Hourly rate must be non-negative: " + hourlyRate);
        }
    }
    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked >= 0) {
            this.hoursWorked = hoursWorked;
        }
        else {
            System.out.println("Hours worked must be non-negative: " + hoursWorked);
        }
    }

    // interface method definitions
    // pays hourlyRate * hoursWorked with overtime of 1.5x applied to any hours over 40
    public double calculatePayment() {
        int STANDARD_HOURS = 40;
        return hourlyRate * Math.min(hoursWorked, STANDARD_HOURS) + 1.5 * (hourlyRate * Math.max(hoursWorked - STANDARD_HOURS, 0));
    }

    public String getPayeeName() {
        return firstName + " " + lastName;
    }

    // class methods
    // displays the freelancer's full name and calculated payment for the period
    public void print() {
        System.out.println("Freelancer: " + getPayeeName());
        System.out.println("Calculated Payment: " + calculatePayment());
    }
}
