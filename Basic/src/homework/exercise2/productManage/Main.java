package homework.exercise2.productManage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> pro = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            String order = sc.next();

            switch (order) {
                case "ADD" -> {
                    String code = sc.next();
                    String name = sc.next();
                    int price = sc.nextInt();
                    pro.add (new Product(code, name, price));

                }
                case "REMOVE" -> {
                    String code = sc.next();
                    String name = sc.next();
                    int price = sc.nextInt();
                    Product temp = new Product(code, name, price);

                    boolean flag = false;
                    for (int i1 = 0; i1 < pro.size(); i1++) {
                        flag = temp.equals(pro.get(i1));
                        if(flag) {
                            pro.remove(i1);
                            break;
                        }
                    }
                    System.out.println(flag);


                }
                case "FIND" -> {
                    String code = sc.next();
                    String name = sc.next();
                    int price = sc.nextInt();
                    Product temp = new Product(code, name, price);

                    boolean flag = pro.contains(temp);
                    System.out.println(flag);

                }
                case "PRINT" -> {
                    System.out.println(pro.size());
                    for (Product product : pro) {
                        System.out.print(
                                " " + product.getCode() + ":" +
                                        product.getName() + ":" +
                                        product.getPrice()
                        );
                    }
                    System.out.println();
                }
            }
        }
    }
}
