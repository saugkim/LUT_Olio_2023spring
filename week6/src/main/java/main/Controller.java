package main;

import java.util.ArrayList;

public class Controller {

    public void driveCar(ArrayList<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                ((Car) vehicle).drive();
            }
        }
    }

    public void sailShip(ArrayList<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Ship) {
                ((Ship) vehicle).sail();
            }
        }
    }
    public void flyPlane(ArrayList<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Plane) {
                ((Plane) vehicle).fly();
            }
        }
    }

    public void showVehicles(ArrayList<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
    
    public void addVehicle(String choice, String input1, String input2, String input3, ArrayList<Vehicle> vehicles) {
        Vehicle vehicle;

        switch(choice) {
            case "1":
                vehicle = new Car(input1, input2, Integer.valueOf(input3));
                break;
            case "2":
                vehicle = new Plane(input1, input2, Integer.valueOf(input3));
                break;
            case "3":
                vehicle = new Ship(input1, input2, Integer.valueOf(input3));
                break;
            default:
                return;
        }
        vehicles.add(vehicle);
    }
}
