package control;
import java.util.Scanner;
public class overall {
    public static void main(String[] args){
        demo2();
    }
    public static void demo1() {
        //回文数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");

        int num = sc.nextInt();
        int temp = num;
        int result = 0;

        while (temp != 0) {
            int a = temp % 10;
            temp /= 10;

            result = result * 10 + a;
        }

        if (num == result) {
            System.out.println(num + "是回文数");
        } else {
            System.out.println(num + "不是回文数");
        }
    }

    public static void demo2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数和除数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while (a >= b){
            a = a - b;
            count++;
        }
        System.out.println("商：" + count);
        System.out.println("余数：" + a);
    }

}