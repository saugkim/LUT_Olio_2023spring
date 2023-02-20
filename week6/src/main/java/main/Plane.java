package main;

public class Plane extends Vehicle{

    public Plane(String manufacture, String model, int speed) {
        super(manufacture, model, speed, new Engine("Suihkumoottori", 500));
    }

    public String toString() {
        return String.format("Lentokone: %s %s\n%s\nHuippunopeus: %dkm/h\n", this.manufacturer, this.model, this.engine, this.speed);
    }

    public void fly() {
        System.out.println(String.format("%s %s lentää kohteeseen!", this.manufacturer, this.model));
    }
    
}
