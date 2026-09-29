package operator;
import java.util.Scanner;
public class sanyuan {
    public static void main(String[] args){
        //关系表达式 ？ 表达式1 ：表达式2
        demo3();
    }
    public static void demo1(){
        int num1 = 10;
        int num2 = 20;
        int result = num1 > num2 ? num1 : num2;
        System.out.println(result);
        System.out.println(num1 > num2 ? num1 : num2);
    }
    public static void demo2(){
        Scanner sc = new Scanner(System.in);
        int wei1 = sc.nextInt();
        int wei2 = sc.nextInt();
        String re = wei1 == wei2 ? "相同" : "不同";
        System.out.println(re);
    }
    public static void demo3(){
        Scanner sc = new Scanner(System.in);
        int hei1 = sc.nextInt();
        int hei2 = sc.nextInt();
        int hei3 = sc.nextInt();
        int temp = hei1 > hei2 ? hei1 : hei2;
        int res = temp > hei3 ? temp : hei3;
        System.out.println(res);
    }
}
