package string;

import java.util.Scanner;

public class test2Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z'){
                smallCount++;
            }else if(c >= 'A' && c <= 'Z'){
                bigCount ++;
            }else if(c >= '0' && c <= '9'){
                numCount++;
            }
        }
        System.out.println("小写字母数目：" + smallCount);
        System.out.println("大写字母数目：" + bigCount);
        System.out.println("数字数目：" + numCount);

    }

}
