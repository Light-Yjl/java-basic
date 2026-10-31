package Static.function;

import java.util.StringJoiner;

public class arrayUtil {
    private arrayUtil(){}

    public static void printArr(int[] arr){
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(String.valueOf(arr[i]));
        }
        System.out.println(sj);
    }

    public static double getAverage(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double res = sum / arr.length;
        return  res;
    }

}

