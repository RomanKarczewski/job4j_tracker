package ru.job4j.tracker.oop;

import ru.job4j.tracker.Item;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime DateTime = item.getDateTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String formattedDateTime = DateTime.format(formatter);
        System.out.println("Текущие дата и время: " + formattedDateTime);
    }
}
