package Aggregation;
import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Instructor> instructors;
    private ArrayList<Textbook> textbooks;

    // single instructor/textbook constructor
    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructors = new ArrayList<>();
        this.instructors.add(instructor);
        this.textbooks = new ArrayList<>();
        this.textbooks.add(textbook);
    }

    // multi instructor/textbook constructor
    public Course(String courseName, ArrayList<Instructor> instructors, ArrayList<Textbook> textbooks) {
        this.courseName = courseName;
        this.instructors = instructors;
        this.textbooks = textbooks;
    }

    // empty constructor
    public Course() {
        this.courseName = "";
        this.instructors = new ArrayList<Instructor>();
        this.textbooks = new ArrayList<Textbook>();
    }

    // getters
    public String getCourseName() { return courseName; }
    public ArrayList<Instructor> getInstructors() { return instructors; }
    public ArrayList<Textbook> getTextbooks() { return textbooks; }

    // setters
    public void setCourseName(String courseName) { this.courseName = courseName; }
    public void setInstructors(ArrayList<Instructor> instructors) { this.instructors = instructors; }
    public void setTextbooks(ArrayList<Textbook> textbooks) { this.textbooks = textbooks; }

    // class methods
    public void print() {
        System.out.println("Course Name: " + courseName);
        for (Instructor instructor : instructors) {
            System.out.println("Instructor (first and last name): " + instructor.getFirstName() + " " + instructor.getLastName());
        }
        for (Textbook textbook : textbooks) {
            System.out.println("Textbook (title and author): " + textbook.getTitle() + " - " + textbook.getAuthor());
        }
    }
}
