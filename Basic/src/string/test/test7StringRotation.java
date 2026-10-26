package string.test;

import java.util.Scanner;

public class test7StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        boolean flag = false;
        String test = str1;
        for (int i = 0; i < str1.length(); i++) {
            test = rollingStr(test);
            if(test.equals(str2)){
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
    
    public static String rollingStr(String str){
        String res = "";
        char temp = str.charAt(0);
        for (int i = 0; i < str.length() - 1; i++) {
            res += str.charAt(i + 1);
        }
        res += temp;
        return res;
    }
}
