package Aggregation;

public class Textbook {
    private String title;
    private String author;
    private String publisher;

    // constructor
    public Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // empty constructor
    public Textbook() {
        this.title = "";
        this.author = "";
        this.publisher = "";
    }

    // getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getPublisher() { return publisher; }

    // setters
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
}
