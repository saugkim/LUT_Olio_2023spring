package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    private String name;
    private String numero;
    ArrayList<Grade> grades;

    public Student() {
        this.name = "John";
        this.numero = "123456";
        grades = new ArrayList<>();
    }

    public Student(String name, String numero) {
        this.name = name;
        this.numero = numero;
        grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getNumero() {
        return this.numero;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String toString() {
        return String.format("%s: %s", this.numero, this.name);
    }

    public void addGrade(String name, int grade) {
        grades.add(new Grade(name, grade));
    }

    public void showGrade() {
        for (Grade grade : grades) {
            System.out.println(grade);
        }
    }
}
