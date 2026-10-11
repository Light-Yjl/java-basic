package homework.exercise1;
import java.util.Scanner;
public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            String id = sc.next();
            String name = sc.next();
            int score = sc.nextInt();
            students[i] = new Student(id,name,score);
        }

        double averageScore = average(students);
        System.out.printf("average="+"%.2f%n", averageScore);

        Student[] top = findTopStudents(students);
        for (int i = 0; i < top.length; i++) {
            System.out.println("top=" +
                      top[i].getId() + ' '
                    + top[i].getName() + ' '
                    + top[i].getScore() + ' '
                    + top[i].getGrade() + ' ');
        }
    }

    public static Student[] findTopStudents(Student[] students){
        int maxScore = students[0].getScore();

        for (int i = 1; i < students.length; i++) {
            int nowScore = students[i].getScore();
            if(nowScore > maxScore){
                maxScore = nowScore;
            }
        }

        int count = 0;
        for (int i = 0; i < students.length; i++) {
            int nowScore = students[i].getScore();
            if(nowScore == maxScore){
                count++;
            }
        }

        Student[] top = new Student[count];
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            int nowScore = students[i].getScore();
            if(nowScore == maxScore){
                top[index] = students[i];
                index++;
            }
        }

        return top;
    }

    public static double average(Student[] students){
        double averageScore = 0;
        float sum = 0;

        for (int i = 0; i < students.length; i++) {
            sum += students[i].getScore();
        }
        averageScore = sum / students.length;
        return averageScore;
    }
}
