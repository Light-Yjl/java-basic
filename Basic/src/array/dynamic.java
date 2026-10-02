package array;

public class dynamic {
    public static void main(String[] args){
        //动态初始化
        demo1();
    }
    public static void demo1(){
        //动态初始化创建
        String [] arr = new String[50];
        arr[0] = "张三";
        arr[1] = "李四";
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);//null
        /*
        整数类型默认初始化值为0
        小数类型默认初始化值为0.0
        字符类型默认初始化值为'/u0000'空格
        布尔类型默认初始化值为false
        引用数据类型默认初始化值为 null
         */
    }

}
