package controller;

import model.IFile;

import java.io.IOException;

public interface IFileController {

    String readFile(IFile file) throws IOException;

    void writeFile(IFile file) throws IOException;

}