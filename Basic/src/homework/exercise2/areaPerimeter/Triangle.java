package homework.exercise2.areaPerimeter;

public class Triangle extends GeometricObject{
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getArea(){
        double perimeter = this.a + this.b + this.c;
        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
        return area;
    }
    public double getPerimeter(){
        return this.a + this.b + this.c;
    }

}
