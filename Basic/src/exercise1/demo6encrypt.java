package exercise1;
import java.util.Scanner;
public class demo6encrypt {

    /* 我自己写的，有缺陷，如果第一位是0将显示不出来
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int encrypted = encrypt(num);
        System.out.println(encrypted);
    }

    public static int encrypt(int num){
        int encrypted = 0;
        while(num !=0){
            int a = num % 10;
            a = (a + 5) % 10;
            encrypted = encrypted * 10 + a;
            num /= 10;
        }
        return encrypted;
    }
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] encrypted = encrypt(num);
        for (int i = 0; i < encrypted.length; i++) {
            System.out.print(encrypted[i]);
        }

    }
    public static int[] encrypt(int num) {
        int[] encrypted = new int[4];

        for (int i = 0; i < encrypted.length; i++) {
            int a = num % 10;
            a = (a + 5) % 10;
            encrypted[i] = a;
            num /= 10;
        }
        return encrypted;
    }
}
