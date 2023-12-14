package oops_Level3_PP;

interface Shape
{
    public void Input();
    public double Area();
}
public class Circle implements Shape {
    double r = 0;

    @Override
    public void Input() {
        r = 5;
    }

    @Override
    public double Area() {
        return Math.PI*r*r;
    }
}
class Rectangle implements Shape
{
    static double l;
    static double b;
    @Override
    public void Input() {
         l = 5;
         b = 10;

    }

    @Override
    public double Area() {

        return l*b;
    }
}
class Main3
{
    public static void main(String[] args) {
        Circle ci = new Circle();
        Rectangle rec = new Rectangle();
        ci.Input();
        rec.Input();
        System.out.println("Area of circle: "+ci.Area());
        System.out.println("Area of rectangle: "+rec.Area());

    }
}