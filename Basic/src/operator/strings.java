package operator;

public class strings {
    public static void main(String[] args) {
        demo3();
    }
    public static void demo1(){
        System.out.println("123" + 123);
        System.out.println(99 + 1 + "你好");
        System.out.println("abc" + "true");
        System.out.println(1 + 2 + "abc" + 2 + 1);//3abc21
        //+出现字符串，+就变成连接符
    }
    public static void demo2(){
        int age = 18;
        double height = 189.5;
        System.out.println("我的年龄是" + age + "岁，我的身高是" + height + "cm");
    }

    public static void demo3(){
        System.out.println(1 + 'a');
        System.out.println('a' + "abc");
    }
}
