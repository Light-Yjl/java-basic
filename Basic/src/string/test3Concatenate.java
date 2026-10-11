package string;

import java.util.Scanner;

public class test3Concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        String str = arrToString(arr);
        System.out.println(str);
    }
    public static String arrToString(int[] arr){
        if(arr == null){
            return "";
        }
        if(arr.length == 0){
            return "[]";
        }
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1) {
                str = str + arr[i] + ", ";
            }else{
                str = str + arr[i] ;
            }

        }
        str += "]";
        return str;
    }
}
