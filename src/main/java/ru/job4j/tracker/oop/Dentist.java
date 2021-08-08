package ru.job4j.tracker.oop;

public class Dentist extends Doctor {
    private String treatment;

    public Dentist(String name, String surname, String education, String birthday, String certificate, String treatment) {
        super(name, surname, education, birthday, certificate);
        this.treatment = treatment;
    }

    public String getTreatment() {return treatment;
    }
}
