package oops_Level3_PP;

public class OuterClass {
    public void OuterClassMethod()
    {
        InnerClass in = new InnerClass();
        in.Show();
        System.out.println("this is outer class method");
    }
    static class InnerClass
    {

        public void Show()
        {
            System.out.println("This is inner class method");

        }
    }

}
class Main2
{
    public static void main(String[] args) {
        OuterClass ob = new OuterClass();
        ob.OuterClassMethod();


    }
}
