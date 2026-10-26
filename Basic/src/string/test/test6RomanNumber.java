package string.test;

import java.util.Locale;
import java.util.Scanner;

public class test6RomanNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Boolean flag = checkStr(str);
        StringBuilder result = new StringBuilder();
        if(flag){
            for (int i = 0; i < str.length(); i++) {
                String res = changeStr(Integer.parseInt(String.valueOf(str.charAt(i))));
                result.append(res);
            }
        }else{
            System.out.println("输入错误");
        }

        System.out.println(result);

    }


    public static Boolean checkStr(String str){
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                count++;
            }
        }
        if(count == str.length() && count <= 9){
            flag = true;
        }
        return flag;
    }

    public static String changeStr(int num){
        String res = "";
        switch (num){
            case 1 -> res = "Ⅰ";
            case 2 -> res = "Ⅱ";
            case 3 -> res = "Ⅲ";
            case 4 -> res = "Ⅳ";
            case 5 -> res = "Ⅴ";
            case 6 -> res = "Ⅵ";
            case 7 -> res = "Ⅶ";
            case 8 -> res = "Ⅷ";
            case 9 -> res = "Ⅸ";
            case 0 -> res = " ";
        }
        return res;
    }

}
