package Static.function.student;

import java.util.ArrayList;
import java.util.Scanner;

import static Static.function.student.Tull.maxAge;

public class Main {
    public static void main(String[] args) {
        ArrayList<Students> list = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            String gender = sc.next();

            Students stu = new Students(name,age,gender);
            list.add(stu);
        }

        int res = maxAge(list);
        System.out.println(res);
    }
}
