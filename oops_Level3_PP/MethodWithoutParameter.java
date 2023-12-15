package oops_Level3_PP;

public class MethodWithoutParameter {
    public double VolumeOfCuboid()
    {
        double l = 5;
        double b = 10;
        double h = 7;

        return l*b*h;
    }

    public static void main(String[] args) {
        MethodWithoutParameter ob = new MethodWithoutParameter();
        //double r = ob.VolumeOfCuboid();
        System.out.println("Volume of cuboid: " + ob.VolumeOfCuboid());
    }
}
