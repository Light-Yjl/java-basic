package string;

import java.util.StringJoiner;

public class stringJoiner {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        StringJoiner sj = new StringJoiner(",","[","]");

        for (int i = 0; i < arr.length; i++) {
            sj.add(String.valueOf(arr[i]));
        }

        System.out.println(sj);
    }
}
