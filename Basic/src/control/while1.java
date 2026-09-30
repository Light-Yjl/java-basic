package control;
import java.util.Scanner;
public class while1 {
    public static void main(String[] args){
        /*
        while(条件判断语句){
            循环体语句;
            条件控制语句;
        }
         */
        demo1();
    }
    public static void demo1(){
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
    }
    public static void demo2(){
        double i = 0.1;
        int count = 0;
        while (i <= 8844430){
            i *= 2;
            count++;
        }
        System.out.println(count);
    }

}
