package homework.exercise3.Phone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        double price = sc.nextDouble();

        MobilePhone mp = new MobilePhone("13899999999",time,price);
        double fee = 0.0;

        try{
            fee = mp.pay();
        } catch (PayException e) {
            System.out.println("Exception is"
                    + e.getClass().getSimpleName()
                    + ": " + e.getMessage());
        }
        System.out.printf("fee=%.1f%n",fee);
    }
}
