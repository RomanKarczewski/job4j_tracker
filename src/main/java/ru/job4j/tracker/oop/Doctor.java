package ru.job4j.tracker.oop;

public class Doctor extends Profession {

    private String certificate;

    public Doctor(String name, String surname, String education, String birthday, String certificate) {
        super(name, surname, education, birthday);
        this.certificate = certificate;
    }

    public static String diagnosisHeal(Pacient pacient) {
        return pacient.diagnosis;
    }

    public static void main(String[] args) {
        Pacient Vaso = new Pacient ();
        System.out.println(diagnosisHeal(Vaso));
    }
}
