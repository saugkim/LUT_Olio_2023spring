package main;

public class Enrollment {

    int grade;
    Student student;
    Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.grade = -1;
    }

    public void gradeCourse(int grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }
    public Course getCourse() {
        return course;
    }
    public int getGrade() {
        return grade;
    }

    public String toString() {
        return String.format("%s\n%s, arvosana: %d", this.course, this.student, this.grade);
    }    
}
