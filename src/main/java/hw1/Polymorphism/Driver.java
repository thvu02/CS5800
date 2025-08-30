package hw1.Polymorphism;

public class Driver {
    public static void main(String[] args) {
        // instantiate static array and populate ships
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("Tatsu", "1919");
        ships[1] = new Ship("X2", "2002");
        ships[2] = new Ship("Raging Rapids", "1984");

        // output ship information
        for (Ship ship : ships) {
            ship.print();
        }
    }
}
