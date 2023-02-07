package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    final static String INFO = "1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma";

    /*
     * 1) Lisää opiskelija,
     * 2) Listaa opiskelijat,
     * 3) Lisää opiskelijalle suorite,
     * 4) Listaa opiskelijan suoritteet,
     * 5) Laske opiskelijan suoritusten keskiarvo,
     * 6) Laske opiskelijan suoritusten mediaani,
     * 7) Tallenna opiskelijat tiedostoon,
     * 8) Lataa opiskelijat tiedostosta,
     * 0) Lopeta ohjelma
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean onGoing = true;

        University lut = new University();
        Calculator calculator = new Calculator();

        while (onGoing) {
            System.out.println(INFO);
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.println("Anna opiskelijan nimi?");
                    String input1 = scanner.nextLine();
                    System.out.println("Anna opiskelijan opiskelijanumero:");
                    String input2 = scanner.nextLine();

                    lut.addStudent(new Student(input1, input2));
                    break;
                case "2":
                    lut.listStudent();
                    break;
                case "3":
                    ArrayList<Integer> x3 = lut.showMenu();
                    System.out.println("Mille opiskelijalle suorite lisätään?");
                    String input3 = scanner.nextLine();
                    try {
                        if (x3.contains(Integer.valueOf(input3))) {
                            Student s = lut.getStudentByIndex(Integer.valueOf(input3));
                            System.out.println("Mille kurssille suorite lisätään?");
                            String input4 = scanner.nextLine();
                            System.out.println("Mikä arvosana kurssille lisätään?");
                            String input5 = scanner.nextLine();
                            s.addGrade(input4, Integer.valueOf(input5));
                        } else {
                            System.out.println("Syöte oli väärä");
                        }
                    } catch (NumberFormatException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case "4":
                    ArrayList<Integer> x4 = lut.showMenu();
                    System.out.println("Minkä opiskelijan suoritteet listataan?");
                    String input6 = scanner.nextLine();
                    try {
                        if (x4.contains(Integer.valueOf(input6))) {
                            Student s = lut.getStudentByIndex(Integer.valueOf(input6));
                            s.showGrade();
                        } else {
                            System.out.println("Syöte oli väärä");
                        }
                    } catch (NumberFormatException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case "5":
                    ArrayList<Integer> x5 = lut.showMenu();
                    System.out.println("Minkä opiskelijan suoritteiden keskiarvo lasketaan?");
                    String input7 = scanner.nextLine();
                    try {
                        if (x5.contains(Integer.valueOf(input7))) {
                            Student s = lut.getStudentByIndex(Integer.valueOf(input7));
                            calculator.getAverageGrade(s);
                        } else {
                            System.out.println("Syöte oli väärä");
                        }
                    } catch (NumberFormatException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case "6":
                    ArrayList<Integer> x6 = lut.showMenu();
                    System.out.println("Minkä opiskelijan suoritteiden mediaani lasketaan?");
                    String input8 = scanner.nextLine();
                    try {
                        if (x6.contains(Integer.valueOf(input8))) {
                            Student s = lut.getStudentByIndex(Integer.valueOf(input8));
                            calculator.getMedianGrade(s);
                        } else {
                            System.out.println("Syöte oli väärä");
                        }
                    } catch (NumberFormatException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case "7":
                    lut.saveStudents();
                    break;
                case "8":
                    lut.loadStudents();
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