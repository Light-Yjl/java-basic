package oop.Interfaces.relationship;
/*
接口和类之间的关系：
类和类：继承，只能单继承不能多继承，可以多层继承
类和接口：可以单实现，也可以多实现，还可以在继承一个类的同时实现多个接口
接口和接口：继承关系，可以单继承，也可以多继承（如果实现类实现了最下面的子接口，那么需要重写所有抽象方法）
 */

public class InterImpl implements Inter3{
    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void method3() {

    }
}
