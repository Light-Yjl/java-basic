package method;

import java.util.Scanner;

public class parameter2area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        circleArea(r);
    }
    public static void circleArea(double r){
        double area = 3.14 * r * r;
        System.out.println(area);
    }
}
