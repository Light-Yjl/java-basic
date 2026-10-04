package exercise1;
import java.util.Scanner;
public class demo1plane {
    //抽取方法快捷键：ctrl + alt + M
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double price = sc.nextDouble();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入头等舱（1）或经济舱（0）");
        int seat = sc.nextInt();
        Result result = new Result(price, month, seat);

        double newPrice = realPrice(result.price(), result.month(), result.seat());
        System.out.println(newPrice);
    }

    private record Result(double price, int month, int seat) {
    }

    public static double realPrice(double price , int month ,int seat){
        if(month>= 5 && month <=10){
            if(seat == 1) return price * 0.9;
            else return price * 0.85;
        }else{
            if(seat == 1) return price * 0.7;
            else return price * 0.65;
        }
    }
}
