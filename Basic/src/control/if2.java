package control;
import java.util.Scanner;
public class if2 {
    public static void main(String[] args){
        /*
        if(关系表达式){
        语句体1；
        } else {
        语句体2；
        }
         */
        demo3();
    }
    public static void demo1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("决定吃什么，请输入身上的钱：");
        int money = sc.nextInt();
        if (money > 100){
            System.out.println("网红餐厅");
        } else {
            System.out.println("沙县小吃");
        }
    }
    public static void demo2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入余额：");
        int num = sc.nextInt();
        if (num >= 600){
            System.out.println("支付成功！");
        } else {
            System.out.println("支付失败。。。");
        }
    }
    public static void demo3(){
        //if 的嵌套
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票号：");
        int ticket = sc.nextInt();
        if(ticket >=1 && ticket <= 100) {
            if (ticket % 2 == 1) {
                System.out.println("座位在左边");
            } else {
                System.out.println("座位在右边");
            }
        } else {
            System.out.println("票号不合法！！！");
        }

    }
}
