package oops_Level3_PP;

public class MethodWithParameter {
    public void AreaOfRectangle (double l, double b)
    {
        double areaOfRectangle = l*b;
        System.out.println("Area of rectangle: " + areaOfRectangle);
    }

    public static void main(String[] args) {
        MethodWithParameter ob = new MethodWithParameter();
        ob.AreaOfRectangle(10, 15);
    }

}
