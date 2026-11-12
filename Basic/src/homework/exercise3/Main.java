package homework.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidTicketException {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String type = sc.next();
            int distance = sc.nextInt();
            try {
                TicketFactory.creat(type, distance).show();
            }
            catch (InvalidTicketException ex){
                System.out.println("INVALID");
            }
        }

    }
}
