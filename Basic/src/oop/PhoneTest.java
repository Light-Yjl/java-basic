package oop;
//先设计类，才能设计对象
        /*
        public class 类名{
            1.成员变量
            2.成员方法
            3.构造器
            4.代码块
            5.内部类
         */
//设计对象
public class PhoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        Phone p = new Phone();
        //给手机赋值
        p.brand = "小米";
        p.price = 1999.98;
        //获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);
        //调用手机中的方法
        p.call();
        p.playGame();


        //创建手机的对象
        Phone p2 = new Phone();
        //给手机赋值
        p2.brand = "iphone";
        p2.price = 10999.99;
        //获取手机对象中的值
        System.out.println(p2.brand);
        System.out.println(p2.price);
        //调用手机中的方法
        p2.call();
        p2.playGame();
    }
}
