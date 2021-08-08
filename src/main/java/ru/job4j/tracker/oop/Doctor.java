package ru.job4j.tracker.oop;

import java.time.LocalDate;

public class Doctor extends Profession {

    public Doctor () {
    }

    public static String diagnosisHeal(Pacient pacient) {
        return pacient.diagnosis;
    }

    public static void main(String[] args) {
        Pacient Vaso = new Pacient ();
        System.out.println(diagnosisHeal(Vaso));
    }
}
