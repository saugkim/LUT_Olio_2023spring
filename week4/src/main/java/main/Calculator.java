package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {

    public Calculator() {

    }

    public double getAverageGrade(Student s) {
        ArrayList<Grade> grades = s.getGrades();
        if (grades.size() == 0) {
            System.out.println(String.format("Keskiarvo on 0.0"));
            return 0.0;
        }

        double sum = 0;
        for (Grade grade : grades) {
            sum += grade.getGrade();
        }
        double average = sum / grades.size();
        System.out.println(String.format("Keskiarvo on %.1f", average));

        return average;
    }

    public double getMedianGrade(Student s) {
        if (s.getGrades().size() == 0) {
            System.out.println(String.format("Mediaani on 0.0"));
            return 0;
        }

        List<Integer> grades = new ArrayList<>();
        for (Grade g : s.getGrades()) {
            grades.add(g.getGrade());
        }

        Collections.sort(grades);

        double median;
        if (grades.size() % 2 == 0)
            median = (double) (grades.get(grades.size() / 2) + grades.get(grades.size() / 2 - 1)) / 2;
        else
            median = (double) grades.get(grades.size() / 2);

        System.out.println(String.format("Mediaani on %.1f", median));
        return median;
    }
}
