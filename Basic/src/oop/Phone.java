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
public class Phone {
    //属性
    String brand;
    double price;
    //行为：
    public void call(){
        System.out.println("手机在打电话");
    }
    public void playGame(){
        System.out.println("手机在玩游戏");
    }
}
