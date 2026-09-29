package operator;
import java.util.Scanner;
public class code {
    public static void main(String[] args){
        //正数的反码不变，负数的反码符号位不变其余位取反-55 = -56 反码 ＋ 1，即用反码可以计算，但是跨0有问题
        //补码在反码的基础上加一，用补码来计算跨0不会出现问题。所以计算机的计算都是以补码形式进行
        demo6();
    }
    public static void demo1(){
        //隐式转换
        byte a = 10;
        int b = a;
        System.out.println(b);
    }
    public static void demo2(){
        //强制转换,去掉前面的三个字节，只取最后的字节，只取后八位
        int x = 200;
        byte y = (byte) x;
        System.out.println(y);
    }
    public static void demo3(){
        int a = 200;
        System.out.println(a << 2);
    }
    public static void demo4(){
        int a = 200;
        System.out.println(a >> 2);
    }
    public static void demo5(){
        int a = 200;
        int b =10;
        System.out.println(a | b);
    }
    public static void demo6(){
        int a = 200;
        int b = 10;
        System.out.println(a & b);
    }

}
