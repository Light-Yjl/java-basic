package oop.inheritance.Super;

public class Student extends Person{
    String school;
    public Student() {
        super();
        System.out.println("子类的无参构造");
    }

    public Student(String name, int age,String school) {
        super(name, age);
        this.school = school;
    }
}
