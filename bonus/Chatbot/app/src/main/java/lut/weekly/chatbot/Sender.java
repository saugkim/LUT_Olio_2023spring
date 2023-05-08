package lut.weekly.chatbot;

public class Sender {
    String name;
    int color;

    public Sender() {

    }
    public Sender(String name, int color) {
        this.name = name;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public int getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

}

