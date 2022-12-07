package com.walking.lesson20_exceptions.task1_throwsException.files;

public class FileClass {
    private String name;
    private int size;
    private FileTypes type;

    public FileClass(String name, int size, FileTypes type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "File name: " + name + type.getType() + ". File size: " + size + "Mb.";
    }

    public String getName() {
        return name;
    }
}
