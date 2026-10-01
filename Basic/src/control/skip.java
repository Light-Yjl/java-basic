package control;

import java.util.Scanner;
import java.util.Random;

public class skip {
    public static void main(String[] args){
        demo8();
    }
    public static void demo1(){
        for (int i = 1; i <= 5; i++) {
            if(i == 3) continue;//结束本次循环，继续下次循环
            System.out.println("小老虎在吃第"+ i + "个包子");
        }
    }
    public static void demo2(){
        for (int i = 1; i <= 5; i++) {
            if(i == 3) break;//结束本次循环
            System.out.println("小老虎在吃第"+ i + "个包子");
        }
    }
    public static void demo3(){
        for (int i = 1; i <= 100; i++) {
            if( i % 10 == 7 || i / 10 == 7 || i % 7 == 0){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
    public static void demo4(){
        //求平方根的整数部分
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            if(i * i == num){
                System.out.println(i + "是" + num + "的平方根");
                break;
            } else if (i * i > num) {
                System.out.println((i - 1) + "是" + num + "平方根的整数部分");
                break;
            }
        }
    }
    public static void demo5(){
        //判断一个数是不是质数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < num ; i++) {
            if( num % i == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(num + "是质数");
        }else {
            System.out.println(num + "不是质数");
        }
    }
    public static void demo6(){
        //随机数
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            //在括号内写的是生成随机数的范围，范围从0 开始到这个数-1结束，左闭右开。
            int num = r.nextInt(100);
            System.out.println(num);
        }
    }
    public static void demo7(){
        // 7~15的随机数
        Random r = new Random();
        int num = r.nextInt(8) + 7;
        System.out.println(num );
    }
    public static void demo8(){
        //猜数字小游戏
        Random r = new Random();
        int res = r.nextInt(50) + 1;
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true){
            int num = sc.nextInt();
            count++;
            if (num == res) {
                System.out.println("猜对啦！！");
                break;
            } else if (num > res) {
                System.out.println("大了");
            } else {
                System.out.println("小了");
            }

            if(count == 5){
                System.out.println("游戏次数用完啦！");
                break;
            }
        }
    }

}
