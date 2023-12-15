package oops_Level3_PP;

public class SwapMethod {
    public int id;
    public String name;

    public SwapMethod(int id, String name) {
        this.id = id;
        this.name = name;
    }
    int temp;
    public void Swap(SwapMethod ob1, SwapMethod ob2)
    {
        int temp = ob1.id;
        ob1.id = ob2.id;
        ob2.id = temp;

        String temp2 = ob1.name;
        ob1.name = ob2.name;
        ob2.name = temp2;

        System.out.println("\nAfter swapping id1: " + ob1.id + " and name1: " + ob1.name);
        System.out.println("After swapping id2: " + ob2.id + " and name2: " + ob2.name);

    }
    public static void main(String[] args) {
        SwapMethod ob1 = new SwapMethod(1, "khushi");
        SwapMethod ob2 = new SwapMethod(2, "raj");
        System.out.println("Before swapping id1: " + ob1.id + " and name1: " + ob1.name);
        System.out.println("Before swapping id2: " + ob2.id + " and name2: " + ob2.name);

        ob1.Swap(ob1, ob2);
    }
}

