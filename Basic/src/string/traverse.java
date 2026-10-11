package string;

import java.util.Scanner;

public class traverse {
    public static void main(String[] args) {
        demo1();
    }
    public static void demo1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
