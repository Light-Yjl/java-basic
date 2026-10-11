package homework.exercise1;

public class Student {
    private String id;
    private String name;
    private int score;

    public Student(String id, String name, int score){
        this.id = id;
        this.name = name;
        this.score = score;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public char getGrade(){
        char grade = 0;
        if(score >= 90 ) grade = 'A';
        else if(score >= 80) grade = 'B';
        else if(score >= 70) grade = 'C';
        else if(score >= 60) grade = 'D';
        else grade = 'F';
        return grade;
    }
}
