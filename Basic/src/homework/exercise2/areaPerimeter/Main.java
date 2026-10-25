package homework.exercise2.areaPerimeter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GeometricObject[] objects = new GeometricObject[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String color = sc.next();
            switch (type) {
                case "C" -> {
                    double radius = sc.nextDouble();
                    objects[i] = new Circle(color, radius);
                }
                case "R" -> {
                    double height = sc.nextDouble();
                    double width = sc.nextDouble();
                    objects[i] = new Rectangle(color, width, height);
                }
                case "T" -> {
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    double c = sc.nextDouble();
                    objects[i] = new Triangle(color, a, b, c);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%s %.2f %.2f %n",
                               objects[i].getColor(),
                               objects[i].getArea(),
                               objects[i].getPerimeter());
        }

        double toArea = totalArea(objects);
        double toPerimeter = totalPerimeter(objects);
        System.out.print("TOTAL ");
        System.out.printf("%.2f %.2f",toArea , toPerimeter);

    }

    public static double totalArea(GeometricObject[] objects){
        double toArea = 0;
        for (GeometricObject object : objects) {
            toArea += object.getArea();
        }
        return toArea;
    }
    public static double totalPerimeter(GeometricObject[] objects){
        double toPerimeter = 0;
        for (GeometricObject object : objects) {
            toPerimeter += object.getPerimeter();
        }
        return toPerimeter;
    }

}
