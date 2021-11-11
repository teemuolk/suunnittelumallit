package controller;

import model.IFile;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class TextFileController implements IFileController {

    private Scanner scanner;

    public TextFileController() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String readFile(IFile file) throws IOException {
        String content = Files.readString(Path.of(file.getName() + ".txt"));
        return content;
    }

    @Override
    public void writeFile(IFile file) throws IOException {
        FileWriter writer = new FileWriter(file.getName() + ".txt");
        System.out.print("Write something: ");
        String text = scanner.nextLine();
        file.setContent(text);
        writer.write(text);
        writer.close();
    }
}