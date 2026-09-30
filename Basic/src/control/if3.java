package control;
import java.util.Scanner;
public class if3 {
    public static void main(String[] args){
        /*
        if (关系表达式){
        语句体1;
        } else if (关系表达式2){
        语句体2;
        }
        ...
        else{
        语句体 n + 1;
        }
         */
        demo2();
    }

    public static void demo1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("奖励系统，请输入小明的成绩：");
        int score = sc.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 95) {
                System.out.println("自行车");
            } else if (score >= 90) {
                System.out.println("游乐场一日游");
            } else if (score >= 80 ) {
                System.out.println("变形金刚");
            } else {
                System.out.println("揍一顿！！");
            }
        } else {
            System.out.println("不合法的成绩");
        }

    }

    public static void demo2(){
        int price = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员级别：");
        int count = sc.nextInt();
        if (count == 1) {
            System.out.println( price * 0.9);
        } else if (count == 2) {
            System.out.println( price * 0.8);
        } else if (count == 3) {
            System.out.println( price * 0.7);
        } else {
            System.out.println( price);
        }

    }

    public static void demo3(){
        boolean green = false;
        boolean red = false;
        boolean yellow = true;
        if (green){
            System.out.println("go");
        } else if(red) {
            System.out.println("stop");
        } else if(yellow){
            System.out.println("slow");
        }
    }




}
