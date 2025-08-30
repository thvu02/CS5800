package Polymorphism;

public class CargoShip extends Ship {
    private int cargoCapacity; // in tonnage

    // constructor
    public CargoShip(String shipName, String yearBuilt, int cargoCapacity) {
        super(shipName, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    // empty constructor
    public CargoShip() {
        this.cargoCapacity = 0;
    }

    // getters
    public int getCargoCapacity() { return cargoCapacity; }

    // setters
    public void setCargoCapacity(int cargoCapacity) { this.cargoCapacity = cargoCapacity; }

    // class methods
    public void print() {
        System.out.println("Ship Name: " + getShipName());
        System.out.println("Cargo Capacity: " + getCargoCapacity());
    }
}
