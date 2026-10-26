package arrryList.Class;

import homework.exercise1.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class addArray {
    public static void main(String[] args) {
        ArrayList<Students> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            Students s = new Students(name,age);
            list.add(s);
        }

        for (int i = 0; i < n; i++) {
            Students stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }

    }
}
