package method;
import java.util.Scanner;
public class parameter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入a,b的值");
        int a = sc.nextInt();
        int b = sc.nextInt();
        getSum(a,b);
    }
    public static void getSum(int num1 , int num2){
        //括号内有参数，用逗号隔开
        int res = num1 + num2;
        System.out.println(res);
    }
}
