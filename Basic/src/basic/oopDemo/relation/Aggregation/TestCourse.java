package basic.oopDemo.relation.Aggregation;

import java.util.Arrays;

public class TestCourse {
    public static void main(String[] args) {
        Course c1 = new Course("Data structure");
        Course c2 = new Course("Java");
        c1.addStudents("Jane");
        c1.addStudents("Jim");
        c1.addStudents("Tom");

        c2.addStudents("Jon");
        c2.addStudents("Lily");

        System.out.println("学Data structure的学生有" + c1.getNumberOfStudents() + "个");
        System.out.println(Arrays.toString(c1.getStudents()));

        System.out.println("学Java的学生有" + c2.getNumberOfStudents() + "个");
        System.out.println(Arrays.toString(c2.getStudents()));
    }
}
