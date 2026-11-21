package basic;

import java.util.Random;
import java.util.Scanner;

public class methodDemo {
    public static void main(String[] args) {
        demo11();
    }

    /**读取一百个数字，计算他们的平均值，并打印出高于平均值的数字*/
    public static void demo9(){
        Random r = new Random();
        int sum = 0;
        double average = 0;
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            int x = r.nextInt(100);
            sum += x;
            arr[i] = x;
        }
        average = sum / 100.0;
        System.out.printf("average:%.1f\n",average);
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if(arr[i] > average){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("count:" + count);
    }

    /**求最大值*/
    public static void demo10(){
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
    }
    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > result)
                result = numbers[i];

        System.out.println("The max value is " + result);
    }

    /** 最大公约数 */
    public static void demo11(){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        System.out.println("The greatest common divisor for " + n1 +
                " and " + n2 + " is " + gcd(n1, n2));
    }
    public static int gcd(int n1, int n2) {
        int gcd = 1; // Initial gcd is 1
        int k = 1; // Possible gcd

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k; // Update gcd
            k++;
        }
        return gcd; // Return gcd
    }

    /**方法的重载*/
    public static void demo12() {
        System.out.println(max(1, 2.0));
    }
    public static double max(int num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    public static double max(double num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

}
