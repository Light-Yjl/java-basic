package basic.oopDemo.relation.Aggregation;

import java.util.Arrays;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[100];
    }
    public void addStudents(String studentName) {
        students[numberOfStudents] = studentName;
        numberOfStudents++;
    }
    public void dropStudents(int id){
        for (int i = id; i < numberOfStudents - 1; i++) {
            students[i] = students[i + 1];
        }
        numberOfStudents--;
    }

    public String[] getStudents() {
        return Arrays.copyOf(students,numberOfStudents);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public int getNumberOfStudents() {
        return numberOfStudents;
    }

}
