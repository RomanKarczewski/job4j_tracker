package ru.job4j.tracker.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("active: " + active);
        System.out.println("status: " + status);
        System.out.println("message: " + message + "\n");
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error erro = new Error(true, 1, "Ошибка");
        erro.printInfo();
        Error err = new Error(false, 2, "Ошибочка");
        err.printInfo();
        Error er = new Error(true, 3, "Капец");
        er.printInfo();
    }
}
