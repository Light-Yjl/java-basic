package Static.function.student;

import java.util.ArrayList;

public class Tull {
    private Tull(){}

    public static int maxAge(ArrayList<Students> students){
        int max = 0;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getAge() > max){
                max = students.get(i).getAge();
            }
        }
        return max;
    }
}
