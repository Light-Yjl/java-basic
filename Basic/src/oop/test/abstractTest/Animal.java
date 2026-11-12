package oop.test.abstractTest;

public abstract class Animal {
    private String name;
    private int age;
    public abstract void eat();
    public void drink(){
        System.out.println("喝水");
    }
}
