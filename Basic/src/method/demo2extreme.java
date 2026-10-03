package method;

public class demo2extreme {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int res = maxNum(arr);
        System.out.println(res);
    }
    public static int maxNum(int [] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
