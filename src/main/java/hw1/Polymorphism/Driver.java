package hw1.Polymorphism;

public class Driver {
    public static void main(String[] args) {
        // instantiate static array and populate ships
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("Tatsu", "1919");
        ships[1] = new CruiseShip("X2", "2002", 1000);
        ships[2] = new CargoShip("Raging Rapids", "1984", 2000);

        // output ship information
        for (Ship ship : ships) {
            ship.print();
        }
    }
}
