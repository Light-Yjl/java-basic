package oop.Interfaces;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(){}

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();
}
