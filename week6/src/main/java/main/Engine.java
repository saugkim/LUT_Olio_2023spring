package main;

public class Engine {

    String name;
    int power;

    public Engine(String name, int power){
        this.name = name;
        this.power = power;
    }
    public String getName() {
        return this.name;
    }
    public int getPower() {
        return this.power;
    }

    public void setPower(int value) {
        this.power = value;
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public String toString(){
        return String.format("Moottori: %s %dkW",this.name, this.power);
    }
}
