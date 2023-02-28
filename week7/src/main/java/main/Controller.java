package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    public void giveGradeToCourse(Gifu gifu, Scanner scanner, int courseId) {
        Course course = gifu.getCourse(courseId);
        ArrayList<Enrollment> ret = gifu.getEnrollments(course);
        for (Enrollment enrollment : ret) {
            System.out.println(String.format("Anna arvosana opiskelijalle %s", enrollment.getStudent()));
            String input = scanner.nextLine();
            enrollment.gradeCourse(Integer.valueOf(input));
        }
    }

    public void listGradesOfStudent(Gifu gifu, int studentId) {
        Student student = gifu.getStudent(studentId);
        System.out.println(String.format("Opiskelijan %s arvosanat:", student));
        //Opiskelijan 0045646 Matti Meikäläinen arvosanat:
        ArrayList<Enrollment> ret = gifu.getEnrollments(student);
        for (Enrollment enrollment : ret) {
            System.out.println(String.format("%s, arvosana: %d", enrollment.getCourse(), enrollment.getGrade()));            
        }
    }
}
