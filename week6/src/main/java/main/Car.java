package main;

public class Car extends Vehicle {

    public Car(String manufacture, String model, int speed) {
        super(manufacture, model, speed, new Engine("V8", 300));
    }

    public String toString() {
        return String.format("Auto: %s %s\n%s\nHuippunopeus: %dkm/h\n", this.manufacturer, this.model, this.engine, this.speed);
    }

    public void drive() {
        System.out.println(String.format("%s %s paahtaa tietä eteenpäin!", this.manufacturer, this.model));
    }


}
