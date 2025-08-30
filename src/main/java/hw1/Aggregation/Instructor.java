package hw1.Aggregation;

public class Instructor {
    private String firstName;
    private String lastName;
    private String officeNumber;

    // constructor
    public Instructor(String firstName, String lastName, String officeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    // empty constructor
    public Instructor() {
        this.firstName = "";
        this.lastName = "";
        this.officeNumber = "";
    }

    // getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getOfficeNumber() { return officeNumber; }

    // setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setOfficeNumber(String officeNumber) { this.officeNumber = officeNumber; }
}
