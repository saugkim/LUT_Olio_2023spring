package main;

public class Course implements PrintInfo {

    String name;
    String id;
    int maxNumberOfStudents;

    public Course(String name, String id, int number) {
        this.name = name;
        this.id = id;
        this.maxNumberOfStudents = number;
    }

    public String getName() {
        return this.name;
    }
    public String getId() {
        return this.id;
    }
    public int getMaxNumberOfStudents() {
        return this.maxNumberOfStudents;
    }

    public String toString() {
        return String.format("%s %s", id, name);
    }

    @Override
    public String getInformation() {
        return this.toString();
    }
}
