package operator;
import java.util.Scanner;

public class relation {
    public static void main(String[] args){
        demo2();
    }
    public static void demo1(){
        System.out.println(1 == 2);
    }
    public static void demo2(){
        Scanner sc = new Scanner(System.in);
        int me = sc.nextInt();
        int her = sc.nextInt();
        System.out.println(me > her);

    }

}
