package array;

public class test3swap {
    public static void main(String[] args){
        //交换两个数组元素的值
        demo2();
    }
    public static void demo1(){
        //交换两个变量的数据
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void demo2(){
        //交换数组数据
        int [] arr = {1,2,3,4,5,6};
        for (int i = 0, j = arr.length - 1 ; i < j ; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
