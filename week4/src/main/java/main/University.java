package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class University {

    final static String FILENAME = "grades.ser";

    private String name;
    private ArrayList<Student> students;

    public University() {
        this.name = "LUT";
        students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void listStudent() {
        System.out.println("Opiskelijat:");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public ArrayList<Integer> showMenu() {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            System.out.println(String.format("%d: %s", i, students.get(i).getName()));
            temp.add(i);
        }
        return temp;
    }

    public Student getStudentByIndex(int id) {
        return students.get(id);
    }

    public void saveStudents() {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILENAME));
            outputStream.writeObject(students);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Opiskelijoiden tallentaminen ei onnistunut");
            e.printStackTrace();
        }
    }

    public void loadStudents() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILENAME));
            students = (ArrayList<Student>) inputStream.readObject();
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Opiskelijoiden lukeminen ei onnistunut");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Opiskelijoiden lukeminen ei onnistunut");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Opiskelijoiden lukeminen ei onnistunut");
            e.printStackTrace();
        }
    }
}
