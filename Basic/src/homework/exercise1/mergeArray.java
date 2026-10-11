package homework.exercise1;

import java.util.Scanner;

public class mergeArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int[] arr1 = new int[num1];
        for (int i = 0; i < num1; i++) {
            arr1[i] = sc.nextInt();
        }

        int num2 = sc.nextInt();
        int[] arr2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = mergeArrays(arr1,arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1,int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
                k++;
            }else{
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while( i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        return arr3;
    }
}
