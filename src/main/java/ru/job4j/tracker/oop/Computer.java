package ru.job4j.tracker.oop;

public class Computer {

    private boolean multiMonitor;

    private int ssd;

    private String cpu;

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer(int ssd, String cpu) {
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer() {
    }

    public Computer(boolean multiMonitor, double ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = (int) ssd;
        this.cpu = cpu;
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
        System.out.println();
    }

    public static void main(String[] args) {
        Computer forth = new Computer(true, 512.0, "AMD Ryzen 7 3700X");
        forth.printInfo();
    }
}

/* public class Computer {

    private boolean multiMonitor;

    private int ssd;

    private String cpu;

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer() {
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu + "\n");
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.printInfo();
        Computer comp = new Computer(true, 256, "AMD Ryzen 5 3600");
        comp.printInfo();
    }

 */