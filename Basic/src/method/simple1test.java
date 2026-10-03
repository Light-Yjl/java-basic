package method;

public class simple1test {
    public static void main(String[] args){
        //看到方法进入方法，方法结束回到调用处
        System.out.println("a");
        method1();
        System.out.println("b");
    }
    public static void printGFInfo(){
        System.out.println("name");
        System.out.println("属性");
        System.out.println("age");
    }
    public static void method1(){
        method2();
        System.out.println("c");
    }
    public static void method2(){
        System.out.println("d");
        System.out.println("e");
    }

}
