package oops_Level3_PP;

public class SuperClass {
    String a;
    SuperClass(String a)
    {
        this.a = a;
        System.out.println(a);
    }

}
class SubClass extends SuperClass
{
    SubClass(String a)
    {
        super("twiney");
        System.out.println(a);
    }

    public static void main(String[] args) {
        SubClass ob = new SubClass("khushi");
    }
}

