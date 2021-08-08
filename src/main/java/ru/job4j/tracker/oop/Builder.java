package ru.job4j.tracker.oop;

public class Builder extends Engineer {
    private int budget;

    public Builder(String name, String surname, String education, String birthday, String branch, int budget) {
        super(name, surname, education, birthday, branch);
        this.budget = budget;
    }

    public int getBudget() {return budget;
    }
}
