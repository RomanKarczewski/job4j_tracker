package ru.job4j.tracker.oop;

public class Programmer extends Engineer {
    private String computer;

    public Programmer(String name, String surname, String education, String birthday, String branch, String computer) {
        super(name, surname, education, birthday, branch);
        this.computer = computer;
    }

    public String getComputer() {return computer;
    }
}
