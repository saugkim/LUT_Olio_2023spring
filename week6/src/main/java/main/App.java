package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    final static String INFO = "1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma";

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      
      ArrayList<Vehicle> vehicles = new ArrayList<>();
      
      boolean onGoing = true;

      Controller controller = new Controller();
      
      while(onGoing){
        System.out.println(INFO);
        String input = scanner.nextLine();

        switch(input) {
          case "1":
            System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
            String choice = scanner.nextLine();
            if (Integer.valueOf(choice) == 1 || Integer.valueOf(choice) == 2 || Integer.valueOf(choice) == 3){
              System.out.println("Anna kulkuneuvon valmistaja:");
              String manufacture = scanner.nextLine();
              System.out.println("Anna kulkuneuvon malli:");
              String model = scanner.nextLine();
              System.out.println("Anna kulkuneuvon huippunopeus:");
              String speed = scanner.nextLine();
              controller.addVehicle(choice, manufacture, model, speed, vehicles);  
            } else {
              System.out.println("Wrong input");
            }
            break;
          case "2":
            controller.showVehicles(vehicles);
            break;
          case "3":
            controller.driveCar(vehicles);
            break;
          case "4":
            controller.flyPlane(vehicles);
            break;
          case "5":
            controller.sailShip(vehicles);
            break;
          case "0":
            System.out.println("Kiitos ohjelman käytöstä.");
            onGoing = false;
            break;
          default:
            System.out.println("Wrong input");
            break;  
        }        
      } 
      scanner.close();
    }
}