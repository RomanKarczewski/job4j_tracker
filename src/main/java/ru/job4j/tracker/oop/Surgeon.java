package ru.job4j.tracker.oop;

public class Surgeon extends Doctor {
    private String tool;

    public Surgeon(String name, String surname, String education, String birthday, String certificate, String tool) {
        super(name, surname, education, birthday, certificate);
        this.tool = tool;
    }

    public String getTool() {return tool;
    }
}
