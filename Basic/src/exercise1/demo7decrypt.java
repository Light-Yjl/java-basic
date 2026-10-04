package exercise1;

import java.util.Scanner;

public class demo7decrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int encrypted = sc.nextInt();
        int []decrypted = decrypt(encrypted);
        int num =0;
        for (int i = 0; i < decrypted.length; i++) {
            num = num * 10 + decrypted[i];
        }
        System.out.println(num);
    }
    public static int[] decrypt(int num){
        int [] decrypted = new int[4];
        for (int i = 0; i < decrypted.length; i++) {
            int a = (num % 10) - 5;
            if(a < 0) {
                a += 10;
            }
            decrypted[i] = a;
            num /= 10;
        }
        return decrypted;
    }

}
