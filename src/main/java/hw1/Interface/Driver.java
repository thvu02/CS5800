package hw1.Interface;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        // initialize ArrayList
        ArrayList<Payable> entities = new ArrayList<Payable>();

        // instantiate freelancer and vendor objects
        Freelancer freelancer_1 = new Freelancer("Joe", "Bruin", 10, 55);
        Freelancer freelancer_2 = new Freelancer("Jill", "Bronco", 15, 20);
        Vendor vendor_1 = new Vendor("cpp", "123456789", 459.00);
        Vendor vendor_2 = new Vendor("ucla", "987654321", 1000.01);

        // add to ArrayList
        entities.add(freelancer_1);
        entities.add(freelancer_2);
        entities.add(vendor_1);
        entities.add(vendor_2);

        double totalPayout = 0.0;
        for (Payable entity : entities) {
            if (entity instanceof Freelancer) {
                ((Freelancer) entity).print();
                totalPayout += ((Freelancer) entity).calculatePayment();
            }
            if (entity instanceof Vendor) {
                ((Vendor) entity).print();
                totalPayout += ((Vendor) entity).calculatePayment();
            }
        }
        System.out.println("Total Payout: " + totalPayout);
    }
}
