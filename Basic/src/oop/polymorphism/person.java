package oop.polymorphism;

public class person {
    private String name;
    private int age;

    public person(){

    }

    public person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println(getName());
        System.out.println(getAge());
    }
}
