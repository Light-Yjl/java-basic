package control;
import java.util.Scanner;
public class for1 {
    public static void main(String[] args){
        /*
        for (初始化语句;条件判断语句;条件控制语句){
            循环体语句;
        }
         */
        demo6();
    }
    public static void demo1(){
        for(int i = 1;i <= 10;i++){
            System.out.println("Hello world");
        }
    }
    public static void demo2(){
        for(int i = 5;i > 0;i--){
            System.out.println(i);
        }
    }
    public static void demo3() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("断线重连中" + i + "...");
        }
    }
    public static void demo4(){
        int num = 0;
        for(int i = 1 ; i <=5 ; i++){
            num += i;
        }
        System.out.println(num);
    }
    public static void demo5(){
        int sum = 0;
        for(int i = 1 ; i <= 100 ; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static void demo6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数代表范围：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = 0;
        for (int i = a; i <= b; i++) {
            if( i % 3 == 0 && i % 5 == 0){
                num++;
            }
        }
        System.out.println(num);
    }

}
