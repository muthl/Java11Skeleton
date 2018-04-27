import java.util.Scanner;
class CreditCardBill {
    public static void main(String []args) {
        double balance, payment, totalpayment;
        balance = 1000.0;
        int Month;
        Month = 1;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nEnter the monthly payment:");
        payment = scan.nextDouble();
        
        while (balance >= 0)    {   //loop while you have more to pay
            balance = (balance + (balance * 0.015)) - payment;  // how much you have left to pay each month
            totalpayment = payment * Month;
            System.out.print("\nMonth: " + Month );
            Month = Month + 1;
            System.out.print("     balance: " + balance );
            System.out.print("     total payments: " + totalpayment);
        }
        
    }
}