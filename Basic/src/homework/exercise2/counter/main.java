package homework.exercise2.counter;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int limit = sc.nextInt();
        BoundedCounter bc = new BoundedCounter(value,limit);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String order = sc.next();
            if(order.equals("ADD")){
                int num = sc.nextInt();
                bc.add(num);
            } else if (order.equals("REMOVE")) {
                int num = sc.nextInt();
                bc.remove(num);
            } else if (order.equals("RESET")) {
                bc.reset();
            } else if (order.equals("SHOW")) {
                System.out.println(bc.getValue());
            }
        }
    }
}
