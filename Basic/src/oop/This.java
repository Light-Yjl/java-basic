package oop;

public class This {
    private int age;
    public void method(){
        int age = 10;
        System.out.println(age);//就近原则，调用的最近的10
        System.out.println(this.age);//调用的是类中成员变量
    }
}
