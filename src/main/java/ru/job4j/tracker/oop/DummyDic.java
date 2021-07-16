package ru.job4j.tracker.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String phrase = "Неизвестное слово. " + eng;
        return phrase;
    }

    public static void main(String[] args) {
        DummyDic Vasia = new DummyDic();
        String say = Vasia.engToRus("Привет");
        System.out.println(say);
    }
}
