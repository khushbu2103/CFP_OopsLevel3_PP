package oops_Level3_PP;

public class ConstructorChaining {
    ConstructorChaining()
    {
        this(20);
        System.out.println("The Default constructor");
    }
    ConstructorChaining(int x)
    {
        this(20,30);
        System.out.println("The parameterized constructor");
    }
    ConstructorChaining(int x, int y)
    {
        int sum = x+y;
        System.out.println("Sum: " + sum);
    }
}
class MainClass
{
    public static void main(String[] args) {
        //ConstructorChaining ob = new ConstructorChaining();
        new ConstructorChaining();
    }
}
