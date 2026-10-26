package string.StringBuilder;

import java.util.Scanner;

public class symmetry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.next());
        String str1 = str.toString();
        str.reverse();
        String str2 = str.toString();
        if(str1.equals(str2)){
            System.out.println(str1 + "是对称字符串");
        }else{
            System.out.println(str1 + "不是对称字符串");
        }

    }
}
