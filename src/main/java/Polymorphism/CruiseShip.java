package Polymorphism;

public class CruiseShip extends Ship{
    private int maxNumPassengers;

    // constructor
    public CruiseShip(String shipName, String yearBuilt, int maxNumPassengers) {
        super(shipName, yearBuilt);
        this.maxNumPassengers = maxNumPassengers;
    }

    // empty constructor
    public CruiseShip() {
        this.maxNumPassengers = 0;
    }

    // getters
    public int getMaxNumPassengers() { return maxNumPassengers; }

    // setters
    public void setMaxNumPassengers(int maxNumPassengers) { this.maxNumPassengers = maxNumPassengers; }

    // class methods
    public void print() {
        System.out.println("Ship Name: " + getShipName());
        System.out.println("Max Num Passengers: " + getMaxNumPassengers());
    }
}
