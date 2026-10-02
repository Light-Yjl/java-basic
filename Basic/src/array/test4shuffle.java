package array;

import java.util.Random;

public class test4shuffle {
    public static void main(String[] args) {
        //打乱数组中的数据
        demo2();
    }

    public static void demo1() {
        //打乱两个数据的顺序
        int [] arr = {1,2,3,4,5};
        Random r = new Random();
        int index1 = r.nextInt(5);
        int index2 = r.nextInt(5);
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void demo2(){
        int [] arr = {1,2,3,4,5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(5);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
