package Polymorphism;

public class Ship {
    private String shipName;
    private String yearBuilt;

    // constructor
    public Ship(String shipName, String yearBuilt) {
        this.shipName = shipName;
        this.yearBuilt = yearBuilt;
    }

    // empty constructor
    public Ship() {
        this.shipName = "";
        this.yearBuilt = "";
    }

    // getters
    public String getShipName() { return shipName; }
    public String getYearBuilt() { return yearBuilt; }

    // setters
    public void setShipName(String shipName) { this.shipName = shipName;}
    public void setYearBuilt(String yearBuilt) { this.yearBuilt = yearBuilt; }

    // class methods
    public void print() {
        System.out.println("Ship: " + shipName);
        System.out.println("Year Built: " + yearBuilt);
    }
}
