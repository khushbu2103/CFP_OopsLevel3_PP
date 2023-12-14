package oops_Level3_PP;

import java.util.Scanner;

abstract class Calculator {
    abstract void Add(int num1, int num2);
    abstract void Multiply(int num1, int num2);
    abstract void Division(int num1, int num2);
    abstract void Subtract(int num1, int num2);
}
class Add extends Calculator
{

    @Override
    void Add(int num1, int num2) {
        System.out.println("Addition of two digits: " + (num1+ num2) );
    }

    @Override
    void Multiply(int num1, int num2) {
        System.out.println("Multiplication of two digits:" + num1*num2);
    }

    @Override
    void Division(int num1, int num2) {
        System.out.println("Division of two digits:" + num1/num2);
    }

    @Override
    void Subtract(int num1, int num2) {
        System.out.println("Subtraction of two digits:" + (num1-num2));
    }

    public static void main(String[] args) {
        Add ob = new Add();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two digit");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        ob.Add(num1, num2);
        ob.Multiply(num1, num2);
        ob.Division(num1, num2);
        ob.Subtract(num1, num2);
    }
}


