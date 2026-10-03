package method;

public class arguments {
    public static void main(String[] args) {

        int num = 100;
        System.out.println(num);
        num = change(num);
        System.out.println(num);
        int [] arr = {1,2,3,4};
        change(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
//    public static void change(int num){
//        num = 200;
//    }
    //传递基本数据类型时，形参的改变不会影响实际数据的值。需要进行赋值才能改变。
    //传递引用数据类型时，传递的是地址值，会改变实际数据的值。
    public static int change(int num){
        num = 200;
        return num;
    }
    public static void change(int [] arr ){
        arr[1] = 200;
    }
}
