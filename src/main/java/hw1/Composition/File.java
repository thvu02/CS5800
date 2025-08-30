package hw1.Composition;

public class File {
    private String fileName;

    // constructor
    public File(String fileName) {
        this.fileName = fileName;
    }

    // empty constructor
    public File() {
        this.fileName = "";
    }

    // getters
    public String getFileName() { return fileName; }

    // setters
    public void setFileName(String fileName) { this.fileName = fileName; }

    // class methods
    public void print(String indentSpace) {
        System.out.println(indentSpace + "- " + getFileName());
    }

    // overload print method to abtract indentation work in driver
    // method actually never used since never directly called in driver
    public void print() {
        print("");
    }
}
