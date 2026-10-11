package homework.exercise1;

import java.util.Objects;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String prefix = commonPrefix(str1,str2);
        if(prefix.isEmpty()){
            System.out.println("No common prefix");
        }else{
            System.out.println("The common prefix is " + prefix);
        }
    }

    public static String commonPrefix(String str1 , String str2){
        String result = "";
        int num = 0;
        if(str1.length() < str2.length()){
            num = str1.length();
        }else{
            num = str2.length();
        }
        for (int i = 0; i < num; i++) {
            if(str1.charAt(i) == str2.charAt(i)){
                result += str1.charAt(i);
            }
            else{
                break;
            }
        }
        return result;
    }
}
