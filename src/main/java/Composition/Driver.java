package Composition;

public class Driver {
    public static void main(String[] args) {
        // top level
        Folder phpDemo1 = new Folder("php_demo1");

        // level 1
        Folder sourceFiles = new Folder("Source Files");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");
        phpDemo1.addFolder(sourceFiles);
        phpDemo1.addFolder(includePath);
        phpDemo1.addFolder(remoteFiles);

        // level 2
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        File htaccess = new File(".htaccess");
        File htrouter = new File(".htrouter.php");
        File index = new File("index.html");
        sourceFiles.addFolder(phalcon);
        sourceFiles.addFolder(app);
        sourceFiles.addFolder(cache);
        sourceFiles.addFolder(publicFolder);
        sourceFiles.addFile(htaccess);
        sourceFiles.addFile(htrouter);
        sourceFiles.addFile(index);

        // level 3
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        app.addFolder(config);
        app.addFolder(controllers);
        app.addFolder(library);
        app.addFolder(migrations);
        app.addFolder(models);
        app.addFolder(views);

        // first print
        System.out.println("Initial file directory structure: \n");
        phpDemo1.print();

        // delete the "app" folder
        sourceFiles.deleteFolder("app");

        // second print
        System.out.println("\nAfter delete \"app\" folder; file directory structure: \n");
        phpDemo1.print();

        // delete the "public" folder
        sourceFiles.deleteFolder("public");

        // third print
        System.out.println("\nAfter delete \"public\" folder; file directory structure: \n");
        phpDemo1.print();
    }
}
