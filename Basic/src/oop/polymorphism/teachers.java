package oop.polymorphism;

public class teachers extends person{
    @Override
    public void show(){
        System.out.println("老师的信息为：" + getName() + getAge());
    }
}
