package hw1.Composition;
import java.util.ArrayList;

public class Folder {
    private String folderName;
    private ArrayList<File> files;
    private ArrayList<Folder> subfolders;

    // folder name only constructor
    public Folder(String folderName) {
        this.folderName = folderName;
        this.files = new ArrayList<File>();
        this.subfolders = new ArrayList<Folder>();
    }

    // empty constructor
    public Folder() {
        this.folderName = "";
        this.files = new ArrayList<File>();
        this.subfolders = new ArrayList<Folder>();
    }

    // full constructor
    public Folder(String folderName, ArrayList<File> files, ArrayList<Folder> subfolders) {
        this.folderName = folderName;
        this.files = files;
        this.subfolders = subfolders;
    }

    // getters
    public String getFolderName() { return folderName; }
    public ArrayList<File> getFiles() { return files; }
    public ArrayList<Folder> getSubfolders() { return subfolders; }

    // setters
    public void setFolderName(String folderName) { this.folderName = folderName; }
    public void setFiles(ArrayList<File> files) { this.files = files; }
    public void setSubfolders(ArrayList<Folder> subfolders) { this.subfolders = subfolders; }

    // class methods
    public void print(String indentSpace) {
        System.out.println(indentSpace + "- " + getFolderName());
        for (Folder subfolder : subfolders) {
            subfolder.print(indentSpace + "    ");
        }
        for (File file : files) {
            file.print(indentSpace + "    ");
        }
    }

    // overload print method to abstract indentation work in driver
    public void print() {
        print("");
    }

    public void addFile(File file) {
        // enforce unique names; case insensitive
        for (File curFile : files) {
            if (curFile.getFileName().equals(file.getFileName())){
                System.out.println("File already exists: " + file.getFileName());
                return;
            }
        }
        this.files.add(file);
    }

    public void addFolder(Folder folder) {
        // enforce unique names; case insensitive
        for (Folder subfolder : subfolders) {
            if (subfolder.getFolderName().equals(folder.getFolderName())){
                System.out.println("Folder already exists: " + folder.getFolderName());
                return;
            }
        }
        this.subfolders.add(folder);
    }

    public void deleteFile(String fileName) {
        // can't remove during loop bc will mess up iteration
        File fileToRemove = null;
        for (File file : files) {
            if (file.getFileName().equals(fileName)) {
                fileToRemove = file;
                break;
            }
        }

        // remove file if found
        if (fileToRemove != null) {
            this.files.remove(fileToRemove);
        }
    }

    public void deleteFolder(String folderName) {
        // can't remove during loop bc will mess up iteration
        Folder folderToRemove = null;
        for (Folder subfolder : subfolders) {
            if (subfolder.getFolderName().equals(folderName)) {
                folderToRemove = subfolder;
                break;
            }
        }

        // remove folder if found
        if (folderToRemove != null) {
            this.subfolders.remove(folderToRemove);
        }
    }
}
