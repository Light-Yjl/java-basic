package method;

public class overloading1test {
    public static void main(String[] args) {
        System.out.println(compare((byte)1,(byte)2));
        System.out.println(compare((short)1,(short)1));
        System.out.println(compare(1,1));
        System.out.println(compare(1.1,2.3));
        System.out.println(compare((long)1,(long)1));
    }
    public static boolean compare(byte a ,byte b){
        return a == b;
    }
    public static boolean compare(short a , short b){
        return a == b;
    }
    public static boolean compare(int a ,int b){
        return a == b;
    }
    public static boolean compare(double a ,double b){
        return a == b;
    }
    public static boolean compare(long a ,long b){
        return a == b;
    }
}
