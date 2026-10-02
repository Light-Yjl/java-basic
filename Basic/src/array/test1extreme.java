package array;

public class test1extreme {
    public static void main(String[] args){
        //求最值
        demo2();
    }
    public static void demo1(){
        //求数组的最值
        int [] arr = {33,5,22,44,55};
        int max = arr[0];//max一定要写数组中的值，如果数组值全比0小，那么最大值就不在数组中了
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void demo2(){
        //求最小值
        int [] arr = {-33,-5,-22,-44,-55};
        int min = arr[0];//最小值也不能定义为0
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
