package oop.array;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cars.length; i++) {
            System.out.println("请输入：品牌 价格 颜色");
            String brand = sc.next();
            int price = sc.nextInt();
            String color = sc.next();
            cars[i] = new Car(brand,price,color);
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getBrand() + " " +
                    cars[i].getPrice() + " " +
                    cars[i].getColor() );
        }



    }

}
