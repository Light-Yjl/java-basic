package method;
import java.util.Scanner;
public class demo3exist {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = sc.nextInt();

        boolean flag = ifExist(arr,num);
        System.out.println(flag);

    }
    //如果方法执行到了return 整个方法全部结束，里面的循环也随之结束
    //break和方法没什么关系，是结束循环或者switch的
    public static boolean ifExist(int [] arr , int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num) return true;
        }
        return false;
    }
}
