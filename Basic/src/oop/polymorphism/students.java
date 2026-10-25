package oop.polymorphism;

public class students extends person{
    @Override
    public void show(){
        System.out.println("学生的信息为：" + getName() + getAge());
    }
}
