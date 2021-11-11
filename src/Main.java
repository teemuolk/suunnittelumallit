import controller.IFileController;
import controller.TextFileController;
import model.Encryption;
import model.IFile;
import model.TextFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        IFile file = new TextFile("file");
        IFileController normalHandler = new TextFileController();
        IFileController encryptionHandler = new Encryption(normalHandler);

        encryptionHandler.writeFile(file);
        System.out.println(normalHandler.readFile(file));
        System.out.println(encryptionHandler.readFile(file));

    }
}