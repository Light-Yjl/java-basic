package oop;

//先设计类，才能设计对象
//建议一个文件定义一个类
        /*
        public class 类名{
            1.成员变量：修饰符 数据类型 变量名 = 初始化值。（一般无需指定初始化值，存在默认值。）
            2.成员方法
            3.构造器
            4.代码块
            5.内部类
         */

//javabean类
//之前写的带main的类是测试类

/*
private 关键字，被private修饰的成员只能在本类中使用
针对私有化的成员变量，需要提供get和set方法,对数据进行过滤
 */

public class BoyFriend {
    String name;
    private int age;
    String gender;
    private double height;
    double weight;

    //构造方法是创造对象的时候，有虚拟机调用，给变量初始化的
    //没有写构造方法，虚拟机会自动创建一个空参构造
    //如果写了构造方法，系统就不会创建空参构造
    //建议写上空参和带全部参数的构造

    public BoyFriend(){

    }

    //有参构造
    public BoyFriend(String name,int age,String gender,double height,double weight){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public void setAge(int age){
        if(age >= 18 && age <= 30){
            this.age = age;
        }else{
            System.out.println("非法数据");
        }
    }

    public int getAge(){
        return age;
    }

    public void setHeight(double height){
        if(height > 175 && height < 200){
            this.height = height;
        }
        else {
            System.out.println("不能要。");
        }
    }

    public double getHeight(){
        return height;
    }
    public void sleep(){
        System.out.println("帅哥在睡觉");
    }
    public void eat(){
        System.out.println("帅哥在吃饭");
    }
    public void playGame(){
        System.out.println("帅哥在打游戏");
    }
}
