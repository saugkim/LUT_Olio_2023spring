package main;

public class Vehicle {

    protected String manufacturer;
    protected String model;
    protected int speed;
    protected Engine engine;

    public Vehicle(String manufacturer, String model, int speed, Engine engine) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.speed = speed;
        this.engine = engine;
    }

}
