package Static.values;

public class Main {
    public static void main(String[] args) {
        student s1 = new student("awei",18,"man");
        student s2 = new student("jane",20,"woman");
        student.teacherName = "aley";
        s1.study();
        s1.show();
        s2.study();
        s2.show();
    }
}
