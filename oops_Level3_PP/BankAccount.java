package oops_Level3_PP;

public class BankAccount {
    static double rateOfInterest = 0.1;
    static int balance = 5000;
    static double noOfYears = 5;
    static double totalAmount = 0;
    static double interest = 0;

    public void OuterClassMethod()
    {
        Interest in = new Interest();
        in.CalculateInterest();
    }
    static class Interest{
        public void CalculateInterest()
        {
            totalAmount = balance*(1+(rateOfInterest*noOfYears));
            interest = totalAmount-balance;
            System.out.println("Interest: " + interest);
        }

    }

    public static void main(String[] args) {
        BankAccount ob = new BankAccount();
        ob.OuterClassMethod();
    }
}
