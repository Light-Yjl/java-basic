package homework.exercise2.areaPerimeter;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;


    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea(){
        return this.height * this.width;
    }
    @Override
    public double getPerimeter(){
        return 2 * (this.height + this.width);
    }
}
