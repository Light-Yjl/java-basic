package array;
import java.util.Scanner;
public class traverse {
    public static void main(String[] args){
        demo5();
    }
    public static void demo1(){
        int [] arr = {1,2,3,4,5};
        //数组的遍历，已知个数
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void demo2(){
        //数组的遍历
        int [] arr = {1,2,3,4,5};
        int len = arr.length;
        System.out.println(len);
        for (int i = 0; i < arr.length; i++) { //数组名.fori 快速for循环
            System.out.println(arr[i]);
        }

    }
    public static void demo3(){
        //累加数组
        int [] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
    public static void demo4(){
        //遍历数组中的元素能被三整除，打印并求有几个
        int [] arr = {1,2,3,4,5,6,7,8,9,10 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( arr [i] % 3 == 0){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println(count);
    }
    public static void demo5(){
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                arr[i] = arr[i] / 2;
            }else {
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i]);
        }
    }

}
