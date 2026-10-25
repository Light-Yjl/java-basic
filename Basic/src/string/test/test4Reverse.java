package string.test;

import java.util.Scanner;

public class test4Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str = reverse(str1);
        System.out.println(str);
    }
    public static String reverse(String str1){
        char[] str = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            str[str.length - i - 1] = str1.charAt(i);
        }
        return new String(str);
    }
}
