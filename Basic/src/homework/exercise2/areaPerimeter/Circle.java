package homework.exercise2.areaPerimeter;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
}
