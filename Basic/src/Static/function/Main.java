package Static.function;


import java.util.Scanner;

import static Static.function.arrayUtil.getAverage;
import static Static.function.arrayUtil.printArr;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        printArr(arr);
        double average = getAverage(arr);
        System.out.println(average);
    }
}
