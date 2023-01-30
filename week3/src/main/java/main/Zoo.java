package main;

import java.util.ArrayList;

public class Zoo {

    private String name;

    ArrayList<Animal> animals;

    public Zoo() {
        name = "Korkeasaari";
        animals = new ArrayList<>();
    }

    public Zoo(String name) {
        this.name = name;
        animals = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listAnimals() {
        System.out.println(String.format("%s pitää sisällään seuraavat eläimet:", name));
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void runAnimals(int num) {
        for (Animal animal : animals) {
            for (int i = 0; i < num; i++) {
                animal.run();
            }
        }
    }

    public String toString() {
        return String.format("%s pitää sisällään seuraavat eläimet:", name);
    }
}