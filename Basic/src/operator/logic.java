package operator;
import java.util.Scanner;
public class logic {
    public static void main(String[] args){
        demo7();

    }
    public static void demo1(){
        System.out.println(true & false);
        System.out.println(true & true);
        System.out.println(false & false);
    }

    public static void demo2(){
        System.out.println(true | false);
        System.out.println(true | true);
        System.out.println(false | false);
    }

    public static void demo3(){
        System.out.println(true ^ false);
        System.out.println(true ^ true);
        System.out.println(false ^ false);
    }
    public static void demo4(){
        System.out.println(!true);
        System.out.println(!false);
    }
    public static void demo5(){
        //短路与，短路或
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(true || true);
    }
    public static void demo6(){
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
        //如果左边能确定执行结果，后面表达式不会执行
    }
    public static void demo7(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean res = (num1 % 6 == 0 | num2 % 6 == 0) || ((num1 + num2) % 6 == 0);
        System.out.println(res);
    }

}
