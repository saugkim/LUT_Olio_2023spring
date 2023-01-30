package main;

public class Animal {

    private String kind;
    private String name;
    private int age;

    public Animal() {
        this.kind = "Tiger";
        this.name = "Tiikuru";
        this.age = 3;
    }

    public Animal(String kind, String name, int age) {
        this.kind = kind;
        this.name = name;
        this.age = age;
    }

    public void run() {
        System.out.println(String.format("%s juoksee kovaa vauhtia!", name));
    }

    public String toString() {
        return String.format("%s: %s, %d vuotta", kind, name, age);
    }
}
