package hw1.Aggregation;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        // single course instructor and textbook
        System.out.println("single course instructor and textbook:\n");
        Instructor instructor_1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook_1 = new Textbook("Clean Code", "Robert C. Martin", "Pearson");

        Course course = new Course("Advanced Software Engineering", instructor_1, textbook_1);
        course.print();

        // 2 course instructors and textbooks
        System.out.println("\n2 course instructors and textbooks:\n");
        Instructor instructor_2 = new Instructor("Gilbert", "Young", "0-2121");
        Textbook textbook_2 = new Textbook("Design Patterns", "Erich Gamma", "Addison-Wesley Professional");

        ArrayList<Instructor> instructors = new ArrayList<Instructor>();
        instructors.add(instructor_1);
        instructors.add(instructor_2);

        ArrayList<Textbook> textbooks = new ArrayList<Textbook>();
        textbooks.add(textbook_1);
        textbooks.add(textbook_2);

        Course Course = new Course("Advanced Software Engineering", instructors, textbooks);
        Course.print();
    }
}
