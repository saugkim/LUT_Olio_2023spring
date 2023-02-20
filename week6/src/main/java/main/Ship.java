package main;

public class Ship extends Vehicle{
    
    public Ship(String manufacture, String model, int speed) {
        super(manufacture, model, speed, new Engine("Wärtsilä Super", 1000));
    }

    public String toString() {
        return String.format("Laiva: %s %s\n%s\nHuippunopeus: %dkm/h\n", this.manufacturer, this.model, this.engine, this.speed);
    }

    public void sail() {
        System.out.println(String.format("%s %s seilaa merten ääriin!", this.manufacturer, this.model));
    }
}
