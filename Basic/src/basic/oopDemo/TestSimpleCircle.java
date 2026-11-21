package basic.oopDemo;

public class TestSimpleCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("The area of the circle of radius "
                + c.getRadius() + " is " + c.getArea());
        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius "
                + circle2.getRadius() + " is " + circle2.getArea());

        // Create a circle with radius 125
        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle of radius "
                + circle3.getRadius() + " is " + circle3.getArea());

        // Modify circle radius
        circle2.setRadius(100); // or circle2.setRadius(100)
        System.out.println("The area of the circle of radius "
                + circle2.getRadius() + " is " + circle2.getArea());
    }
}

class Circle{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.round((radius * radius * Math.PI)* 100) /100.0;
    }
}