package homework.exercise1;
import java.util.Scanner;

public class strbin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String result = str_bin(str1, str2);
        System.out.println(result);
    }
    public static String str_bin(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) <= str2.charAt(j)) {
                result.append(str1.charAt(i));
                i++;
            } else {
                result.append(str2.charAt(j));
                j++;
            }
        }
        while (i < str1.length()) {
            result.append(str1.charAt(i));
            i++;
        }
        while (j < str2.length()) {
            result.append(str2.charAt(j));
            j++;
        }
        return result.toString();
    }
}
