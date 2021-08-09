package ru.job4j.tracker.oop.pojo;

public class Library {

    public static void main(String[] args) {
        Book earth = new Book("Earth", 911);
        Book power = new Book("Power", 239);
        Book money = new Book("Money", 113);
        Book code = new Book("Clean code", 666);
        Book[] books = new Book[4];
        books[0] = earth;
        books[1] = power;
        books[2] = money;
        books[3] = code;
        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            System.out.println(bo.getName() + " - " + bo.getPages());
        }
        System.out.println("Replace books 0 and 3");
        Book boo = books[0];
        books[0] = books[3];
        books[3] = boo;
        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            System.out.println(bo.getName() + " - " + bo.getPages());
        }
        System.out.println("Shown only books with name \"Clean code\"");
        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            if (bo.getName().equals("Clean code")) {
                System.out.println(bo.getName() + " - " + bo.getPages());
            }
        }
    }
}
