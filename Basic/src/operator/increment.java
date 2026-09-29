package operator;

public class increment {
    public static  void main(String[] args){
        demo4();
    }

    public static void demo1(){
        int a = 1;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);
        //单独用一行结果一样
    }

    public static void demo2(){
        int x = 10;
        int y = x++;
        System.out.println(y);
        System.out.println(x);
        //a++先用后加
    }
    public static void demo3(){
        int num1 = 10;
        int num2 = ++num1;
        System.out.println(num2);
        System.out.println(num1);
        //++a先加后用
    }
    public static void demo4(){
        int b1 = 10;
        int b2 = b1++;
        int b3 = ++b1;
        System.out.println("b1:" + b1);
        System.out.println("b2:" + b2);
        System.out.println("b3:" + b3);
    }

}









