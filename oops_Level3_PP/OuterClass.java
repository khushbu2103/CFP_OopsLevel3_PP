package oops_Level3_PP;

public class OuterClass {
    public void OuterClassMethod()
    {
        InnerClass in = new InnerClass();
        in.Show();
    }
    static class InnerClass
    {

        public void Show()
        {

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
