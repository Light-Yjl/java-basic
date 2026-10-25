package oop.polymorphism;

public class administrator extends person{
    @Override
    public void show(){
        System.out.println("管理员的信息为：" + getName() + getAge());
    }
}
