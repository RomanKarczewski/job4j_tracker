package ru.job4j.tracker.oop;

public class Engineer extends Profession {
    private String branch;

    public Engineer(String name, String surname, String education, String birthday, String branch) {
        super(name, surname, education, birthday);
        this.branch = branch;
    }

    public String getBranch() {return branch;
    }
}
