package main;

import java.util.Scanner;

public class App 
{
    static String info = "1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma";

    public static void main( String[] args ) {

        Hedgehog hedgehog = new Hedgehog();

        Scanner scanner = new Scanner(System.in);
        boolean onGoing = true;

        while(onGoing) {
            System.out.println(info);
            String input = scanner.nextLine();

            switch (input){
                case "1":
                    System.out.println("Mitä siili sanoo:");
                    String input1 = scanner.nextLine();
                    if (input1.isEmpty()) {
                        System.out.println(hedgehog);
                    } else {
                        hedgehog.speak(input1);                         
                    }
                    break;
                case "2":
                    System.out.println("Anna siilin nimi:");
                    String inputName = scanner.nextLine();
                    System.out.println("Anna siilin ikä:");
                    String inputAge = scanner.nextLine();
                    try {
                        int age = Integer.valueOf(inputAge);
                        if (age < 0 || age > 100)
                            System.out.println("Syöte oli väärä");
                        else
                            hedgehog = new Hedgehog(inputName, age);
                    } catch (NumberFormatException ex) {
                        ex.printStackTrace();
                    }        
                    break;
                case "3":
                    System.out.println("Kuinka monta kierrosta?");
                    String input3 = scanner.nextLine();
                    if (input3.isEmpty())
                        System.out.println("Syöte oli väärä");
                    else {
                        try{
                            hedgehog.run(Integer.valueOf(input3)); 
                        }
                        catch (NumberFormatException ex){
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