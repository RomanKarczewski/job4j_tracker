package ru.job4j.tracker.oop.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFIO("Vasia Dudochkin");
        student.setGroup("Tigers");
        student.setPostupl(new Date());

        System.out.println(student.getFIO() + " are studying in the group \"" + student.getGroup() + "\" since " + student.getPostupl());
    }
}
