package main;

import java.util.Scanner;

public class App {

    private final static String WELCOME = "Tervetuloa Gifu-järjestelmään";
    private final static String BYE = "Kiitos ohjelman käytöstä.";
    private final static String ERRORMESSAGE = "WRONG INPUT, try again";
    private final static String INFO = 
        String.format("1) Luo uusi kurssi, "
                    + "2) Luo uusi opiskelija, "
                    + "3) Listaa kurssit, "
                    + "4) Listaa opiskelijat, "
                    + "5) Lisää opiskelija kurssille, " 
                    + "6) Anna kurssiarvosanat, "
                    + "7) Listaa kurssilla olevat opiskelijat, " 
                    + "8) Listaa opiskelijan arvosanat, "
                    + "9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, "
                    + "0) Lopeta ohjelma");


    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

  	  	printOut(WELCOME);
        printOut("Mille yliopistolle haluat ottaa järjestelmän käyttöön?");
        String input = scanner.nextLine();

        Gifu gifu = new Gifu(input);

        boolean onGoing = true;
        
        while(onGoing) {
            printOut(INFO);
            String choice = scanner.nextLine();

            switch(choice) {
                case "1":
                    System.out.println("Anna kurssin nimi:");
                    String inputCourseName = scanner.nextLine();
                    System.out.println("Anna kurssin ID:");
                    String inputCourseId = scanner.nextLine();
                    System.out.println("Anna kurssin maksimi opiskelijamäärä:");
                    String inputMax = scanner.nextLine();
                    gifu.addCourse(new Course(inputCourseName, inputCourseId, Integer.valueOf(inputMax)));
                    break;
                case "2":
                    System.out.println("Anna opiskelijan nimi:");
                    String inputStudentName = scanner.nextLine();
                    System.out.println("Anna opiskelijan opiskelijanumero:");
                    String inputStudentId = scanner.nextLine();
                    gifu.addStudent(new Student(inputStudentName, inputStudentId));
                    break;
                case "3":
                    gifu.listCourses();
                    break;
                case "4":
                    gifu.listStudents();
                    break; 
                case "5":
                    gifu.listCourses();
                    System.out.println("Mille kurssille haluat lisätä opiskelijan? Syötä kurssin numero:");
                    String inputCourse5 = scanner.nextLine();
                    gifu.listStudents();
                    System.out.println("Minkä opiskelijan haluat lisätä kurssille? Syötä opiskelijan numero:");
                    String inputStudent5 = scanner.nextLine();
                    gifu.enrollStudent(gifu.getStudent(Integer.valueOf(inputStudent5)), gifu.getCourse(Integer.valueOf(inputCourse5)));
                    break;
                case "6":
                    gifu.listCourses();
                    System.out.println("Minkä kurssin haluat arvostella? Syötä kurssin numero:");
                    String inputCourse6 = scanner.nextLine();
                    gifu.giveGradeToCourse(scanner, Integer.valueOf(inputCourse6));
                    break;
                case "7":
                    gifu.listCourses();
                    System.out.println("Minkä kurssin opiskelijat haluat listata? Syötä kurssin numero:");
                    String inputCourse7 = scanner.nextLine();
                    gifu.listStudentsOnCourse(Integer.valueOf(inputCourse7));
                    break;
                case "8":
                    gifu.listStudents();
                    System.out.println("Minkä opiskelijan arvosanat haluat listata? Syötä opiskelijan numero:");
                    String inputStudent8 = scanner.nextLine();
                    gifu.listGradesOfStudent(Integer.valueOf(inputStudent8));
                    break; 
                case "9":
                    gifu.listEnrollments();
                    break;
                case "0":
                    onGoing = false;
                    printOut(BYE);
                    break;
                default:
                    printOut(ERRORMESSAGE);
                    break;               
            }
        }
        scanner.close();
    }

    private static void printOut(String message) {
        System.out.println(message);
    }
}
