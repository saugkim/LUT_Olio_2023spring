package main;

import java.util.Scanner;

public class App {
    static String INFO = "1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean onGoing = true;

        System.out.println("Anna eläintarhalle nimi:");
        String nameOfZoo = scanner.nextLine();

        Zoo zoo = new Zoo(nameOfZoo);

        while (onGoing) {
            System.out.println(INFO);
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Mikä laji?");
                    String inputKind = scanner.nextLine();
                    System.out.println("Anna eläimen nimi:");
                    String inputName = scanner.nextLine();
                    System.out.println("Anna eläimen ikä:");
                    String inputAge = scanner.nextLine();
                    try {
                        int age = Integer.valueOf(inputAge);
                        if (age < 0 || age > 100)
                            System.out.println("Syöte oli väärä");
                        else {
                            zoo.addAnimal(new Animal(inputKind, inputName, age));
                        }
                    } catch (NumberFormatException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case "2":
                    zoo.listAnimals();
                    break;
                case "3":
                    System.out.println("Kuinka monta kierrosta?");
                    String input3 = scanner.nextLine();
                    if (input3.isEmpty())
                        System.out.println("Syöte oli väärä");
                    else {
                        try {
                            zoo.runAnimals(Integer.valueOf(input3));
                        } catch (NumberFormatException ex) {
                            ex.printStackTrace();
                        }
                    }
                    break;
                case "0":
                    System.out.println("Kiitos ohjelman käytöstä.");
                    onGoing = false;
                    break;
                default:
                    System.out.println("Syöte oli väärä");
                    break;
            }
        }
        scanner.close();
    }
}