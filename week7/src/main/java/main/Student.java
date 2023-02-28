package main;

public class Student implements PrintInfo{

    String name;
    String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    public String toString() {
        return String.format("%s %s", id, name);
    }

    @Override
    public String getInformation() {
        return this.toString();
    }   
}
