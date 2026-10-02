package array;
import java.util.Random;
public class test2sum {
    public static void main(String[] args){
        //遍历数组求和
        demo1();
    }
    public static void demo1(){
        int sum = 0;
        double avg = 0;
        int count = 0;
        int [] arr = new int [10];

        for (int i = 0; i < arr.length; i++) {
            //定义并输出数组元素
            Random r = new Random();
            arr[i] = r.nextInt(100) + 1;
            //求和
            sum += arr[i];
        }
        System.out.println("和：" + sum);
        //求平均值
        avg = 0.1 * sum ;
        System.out.println("平均数" + avg);
        //求比平均数小的值
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < avg){
                count++;
            }
        }
        System.out.println("比平均数小的个数：" + count);
        System.out.println("数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

}
