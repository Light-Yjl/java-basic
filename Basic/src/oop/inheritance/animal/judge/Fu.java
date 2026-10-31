package oop.inheritance.animal.judge;


/*
构造方法：非private ，private 都不能被继承
成员变量：非private ，private 都可以被继承，但是private不能被使用
成员方法：可以继承虚方法
        虚方法：非private 非static 非final
 */
public class Fu {
    String name = "Fu";
    int age = 40;

    public Fu() {
    }

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void fuShow1(){
        System.out.println("public  fuShow1");
    }
    private void fuShow2(){
        System.out.println("private fuShow2");
    }


}
