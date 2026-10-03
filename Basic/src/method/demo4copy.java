package method;

public class demo4copy {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int [] copy = copyOfRange(arr,3,7);

        //打印复制的数组
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }

    }
    public static int[] copyOfRange(int [] arr,int from,int to){
        int [] copy = new int[to - from];
        for (int i = from; i < to; i++) {
            copy[i - from] = arr[i];
        }
        return copy;
    }
}
