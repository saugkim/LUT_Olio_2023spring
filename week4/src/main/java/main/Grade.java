package main;

import java.io.Serializable;

public class Grade implements Serializable {

    private String course;
    private int grade;

    public Grade(String name, int grade) {
        course = name;
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public String toString() {
        return String.format("%s: %d", this.course, this.grade);
    }
}
