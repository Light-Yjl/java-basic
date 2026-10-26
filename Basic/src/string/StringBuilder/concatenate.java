package string.StringBuilder;

public class concatenate {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if(i != arr.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }
}
