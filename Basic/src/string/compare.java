package string;
import java.util.Scanner;
public class compare {
    public static void main(String[] args) {
        demo2();
    }
    public static void demo1(){
        String s1 = new String("abc");
        String s2 = "Abc";
        //== 基本数据类型比较的是数据值，引用数据类型比较的是地址值
        System.out.println(s1 == s2); //但是第一个直接s1 = "abc",显示的是true
        //比较字符串中内容是否完全相等
        boolean res1 = s1.equals(s2);
        System.out.println(res1);
        //忽略大小写，比较字符串内容是否相等
        boolean res2 = s1.equalsIgnoreCase(s2);
        System.out.println(res2);
    }

    public static void demo2(){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = "abc";
        System.out.println(str1 == str2); //键盘录入一样的却输出false
    }

    //结论，以后只要想比较字符串，就必须用String里面的方法


}
