package Inheritance;

public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;

    // constructor
    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    // empty constructor
    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.ssn = "";
    }

    // getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSsn() { return ssn; }

    // setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setSsn(String ssn) { this.ssn = ssn; }
}
