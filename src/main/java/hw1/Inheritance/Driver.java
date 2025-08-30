package hw1.Inheritance;

public class Driver {
    public static void main(String[] args) {
        // instantiation
        SalariedEmployee employee_1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee employee_2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee employee_3 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee employee_4 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        SalariedEmployee employee_5 = new SalariedEmployee("Renwa", "Chenl", "555-55-5555", 1700);
        BaseEmployee employee_6 = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommissionEmployee employee_7 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);

        // tests
        System.out.println(employee_1.getSsn());
        System.out.println(employee_2.getWage());
    }
}
