package method;
import java.util.Scanner;
public class parameter1test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double len = sc.nextDouble();
        double width = sc.nextDouble();
        zhouChang(len,width);
    }
    public static void zhouChang(double a,double b){
        //求长方形周长
        double C = 2 * (a + b);
        System.out.println(C);
    }
}
