package basic;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class stringDemo {
    private static final String FILL_CODE_OR_CLICK_ANSWER = " ";

    public static void main(String[] args) {
        demo8();
    }
    //isDigit ,isLetter
    public static void demo1(){
        int a = 'a';
        System.out.println("a: " + a);
        char c = 97;
        System.out.println("c: " + c);
        char ch = 'c';
        System.out.println("ch: " + ch);
        System.out.println( "is ch > 'A' && ch < 'Z': " +(ch > 'A' && ch < 'Z'));
        boolean f1 = isDigit('5');
        System.out.println("'5' is digit: " + f1);
        boolean f2 = isLetter('5');
        boolean f3 = isLetter(ch);
        System.out.println("'5' is letter: "+f2);
        System.out.println("ch is letter: "+f3);

    }
    //concat,toUpperCase,toLowerCase,trim
    public static void demo2(){
        String str1 = "abc";
        String str2 = "DEF";
        String str3 = "   hello   world   ";
        String s = str1.concat(str2);
        String s1 = str1.toUpperCase();
        String s2 = str2.toLowerCase();
        String s3 = str3.trim();//去掉两边的空字符
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
    //compareTo
    public static void demo3() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        if (city1.compareTo(city2) < 0)
            System.out.println("The cities in alphabetical order are " +
                    city1 + " " + city2);
        else
            System.out.println("The cities in alphabetical order are " +
                    city2 + " " + city1);
    }
    //compareToIgnoreCase
    public static void demo4() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        if (city1.compareToIgnoreCase(city2) < 0)
            System.out.println("The cities in alphabetical order are " +
                    city1 + " " + city2);
        else
            System.out.println("The cities in alphabetical order are " +
                    city2 + " " + city1);
    }
    //starsWith,endsWith,subString
    public static void demo5(){
        String str = "hello world";
        boolean f1 = str.startsWith("h");
        boolean f2 = str.startsWith("a");
        boolean f3 = str.endsWith("d");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        String str1 = str.substring(2,7);//左闭右开
        System.out.println(str1);

    }
    //indexOf
    public static void demo6(){
        String str = "hello world";
        int num = str.indexOf("l");
        int num1 = str.indexOf("l",3);
        System.out.println(num);
        System.out.println(num1);
        int num2 = str.indexOf("a");
        System.out.println(num2);
        int num3 = str.indexOf("ll");
        System.out.println(num3);
    }
    //charAt
    public static void demo7() {

        String lottery = "" + (int)(Math.random() * 10)
                + (int)(Math.random() * 10);
        System.out.println("The lottery number is " + lottery);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        String guess = input.nextLine();

        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        if (guess.equals(lottery))
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigit1
                && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
    //格式化输出
    public static void demo8() {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees",
                "Radians", "Sine", "Cosine", "Tangent");

        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees,
                radians, Math.sin(radians), Math.cos(radians),
                Math.tan(radians));

        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees,
                radians, Math.sin(radians), Math.cos(radians),
                Math.tan(radians));
    }


}
