package operator;

public class assignment {
    public static void main(String[] args){
        demo5();
    }

    public static void demo1(){
        int a = 10;
        int b = 20;
        a += b;
        System.out.println(a);
        System.out.println(b);

    }

    public static void demo2(){
        int c = 20;
        int d = 1;
        c -= d;
        System.out.println(c);
        System.out.println(d);
    }
    public static void demo3(){
        int e = 20;
        int f = 4;
        e /= f;
        System.out.println(e);
        System.out.println(f);
    }
    public static void demo4(){
        int g = 21;
        int h = 4;
        g *= h;
        System.out.println(g);
        System.out.println(h);
    }

    public static void demo5(){
        int i = 21;
        int j = 4;
        i %= j;
        System.out.println(i);
        System.out.println(j);
    }
}










