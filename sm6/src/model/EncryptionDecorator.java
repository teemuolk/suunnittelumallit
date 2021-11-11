package model;

import controller.IFileController;

import java.io.IOException;

public abstract class EncryptionDecorator implements IFileController {
    protected IFileController encryptingHandler;

    public EncryptionDecorator(IFileController handler) {
        this.encryptingHandler = handler;
    }

    public String readFile(IFile file) throws IOException {
        return encryptingHandler.readFile(file);

    }

    public void writeFile(IFile file) throws IOException {
        encryptingHandler.writeFile(file);
    }
}