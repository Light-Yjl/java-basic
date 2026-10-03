package method;

public class overloading {
    public static void main(String[] args) {
        /*
        同一个类中定义了多个同名的方法，功能相同，参数不同，构成了重载关系。
         */
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
    }
    public static int sum(int a,int b){
        return a + b;
    }
    public static int sum(int a,int b,int c){
        return a + b + c;
    }
}
