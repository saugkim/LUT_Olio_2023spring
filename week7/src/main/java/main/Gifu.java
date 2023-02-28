package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Gifu {
    
    String name;
    ArrayList<Course> courses;
    ArrayList<Student> students;
    ArrayList<Enrollment> enrollments;

    public Gifu (String name) {
        this.name = name;
        courses = new ArrayList<Course>();
        students = new ArrayList<Student>();
        enrollments = new ArrayList<Enrollment>();
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }
    public ArrayList<Student> getStudents() {
        return this.students;
    }
    public ArrayList<Enrollment> getEnrollments() {
        return this.enrollments;
    }

    public Course getCourse(int id) {
        return courses.get(id);
    }
    public Student getStudent(int id) {
        return students.get(id);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public void listCourses() {
        for (int i=0; i< getCourses().size(); i++) {
            System.out.println(String.format("%d) %s", i, getCourses().get(i)));
        }        
    }
    public void listStudents() {
        for (int i=0; i< getStudents().size(); i++) {
            System.out.println(String.format("%d) %s", i, getStudents().get(i)));
        }        
   
    }
    public void listEnrollments() {
        for (int i=0; i< getCourses().size(); i++) {
            System.out.println(getCourses().get(i).getInformation());
            listStudentsOnCourse(i);
        }    
    }

    public void listStudentsOnCourse(int courseId) {
        ArrayList<Enrollment> ret = getEnrollments(getCourse(courseId));
        for (Enrollment enrollement : ret) {
            System.out.println(String.format("%s, arvosana: %d", enrollement.getStudent(), enrollement.getGrade()));
        }
    }

    public void listGradesOfStudent(int studentId) {
        Student student = getStudent(studentId);
        System.out.println(String.format("Opiskelijan %s arvosanat:", student));
        //Opiskelijan 0045646 Matti Meikäläinen arvosanat:
        ArrayList<Enrollment> ret = getEnrollments(student);
        for (Enrollment enrollment : ret) {
            System.out.println(String.format("%s, arvosana: %d", enrollment.getCourse(), enrollment.getGrade()));            
        }
    }

    public void enrollStudent(Student student, Course course) {
        enrollments.add(new Enrollment(student, course));        
    }
    

    public ArrayList<Enrollment> getEnrollments(Course course) {
        ArrayList<Enrollment> ret = new ArrayList<>();
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getCourse().equals(course)) {
                ret.add(enrollment);
            }
        }
        return ret;
    }

    public ArrayList<Enrollment> getEnrollments(Student student) {
        ArrayList<Enrollment> ret = new ArrayList<>();
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getStudent().equals(student)) {
                ret.add(enrollment);
            }
        }
        return ret;
    }

    public void giveGradeToCourse(Scanner scanner, int courseId) {
        Course course = getCourse(courseId);
        ArrayList<Enrollment> ret = getEnrollments(course);
        for (Enrollment enrollment : ret) {
            System.out.println(String.format("Anna arvosana opiskelijalle %s", enrollment.getStudent()));
            String input = scanner.nextLine();
            enrollment.gradeCourse(Integer.valueOf(input));
        }
    }

}
