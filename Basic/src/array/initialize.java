package array;

public class initialize {
    public static void main(String[] args){
        //数组的定义和初始化
        /*
        格式1：数据类型 [] 数组名
        格式2：数据类型 数组名 []
         */
        //容器的类型和存储数据的类型保持一致
        demo3();
    }
    public static void demo1(){
        //静态初始化
        int [] array = {11,22,33};
        double [] array2 = {11.1,22.2,33.3};
        String [] array3 = {"张三","李四","王五"};
    }
    public static void demo2(){
        int [] array = {11,22,33};
        System.out.println(array);// 输出数组的地址值[I@f6f4d33
        /*
        [ 表示当前是一个数组
        I 表示是int类型的
        @ 表示间隔符号
        f6f4d33 真实地址值 16进制
         */
    }
    public static void demo3(){
        //获取数组里的元素
        int [] arr = {1,2,3,4,5};
        int a = arr[1];
        System.out.println(a);
        System.out.println(arr[1]);

        //赋值 一旦赋值，原来的元素就不存在了
        int b = arr[0];
        arr[0] = 100;
        System.out.println(b);
        System.out.println(arr[0]);

    }
}








