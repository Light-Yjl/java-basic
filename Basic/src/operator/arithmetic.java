package operator;
import java.util.Scanner;
public class arithmetic {
    public static void main(String[] args){
    demo6();
    }

    public static void demo1(){
        System.out.println(3 + 2);
        System.out.println(5 - 1);
        System.out.println(7 * 9);
    }

    public static void demo2(){
        //在小数计算可能不精确
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);
        System.out.println(10 / 2);
        System.out.println(10 / 3);
        System.out.println(10.0 / 3);
        //整数用/ 结果只能是整数，小数结果可能不精确
    }
    public static void demo3(){
        System.out.println(10 % 2);
        System.out.println(10 % 3);
    }
    public static void demo4(){
        //取模应用场景
        System.out.println("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(num1 % 2);
    }
    public static void demo5(){
        System.out.println("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        System.out.println(num2 % 10);
        System.out.println((num2 % 100) /10);
        System.out.println(num2 / 100);
    }
    public static void demo6(){
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte) (b1 + b2);
        //强制转换
        System.out.println(b3);
    }


}



















