package ru.job4j.tracker.oop;

public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wulf wulf = new Wulf();
        girl.help(petya);
        petya.kill(wulf);
    }
}
