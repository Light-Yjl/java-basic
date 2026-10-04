package array;
import java.util.Scanner;
public class D2array {
    public static void main(String[] args) {
        //二维数组
        demo4();
    }
    public static void demo1(){
        //静态初始化
        int[][] arr = new int[][] {{11,22},{33,44}};
        //建议把每一个一维数组单独写一行
        int[][] arr1  = {
                {11,22},
                {33,44}
        };
        System.out.println(arr[0]);//获取二维数组中的第一个数组的地址值  [I@f6f4d33
        System.out.println(arr[0][0]);//打印数据11
    }
    public static void demo2(){
        //二维数组遍历
        int[][] arr = {
                {1,2,3,4},
                {4,5,6,7},
                {7,8,9,0}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void demo3(){
        //二维数组动态初始化
        int[][] arr = new int[2][3];//二维数组长度为2，每一行装3个数
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void demo4(){
        int[][] arr = new int[4][3];
        int sales = 0;
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                sales += arr[i][j];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println(sum);
        }
        System.out.println("总营业额：" + sales);

    }
}
