import java.util.Scanner;
class ConcertTickets {
    public static void main(String []args)  {
        Scanner scan = new Scanner(System.in);
        Double amount, cost, subtotal, total, GST, PST, tax;
        
        System.out.println("How much is one ticket?");  
        cost = scan.nextDouble();
        
        System.out.println("How many tickets did you buy?");
        amount = scan.nextDouble();
        
        //Calculations
        subtotal = cost * amount;
        GST = 0.06 * subtotal;
        PST = 0.07 * subtotal;
        tax = GST + PST;
        total = subtotal + GST + PST;
        
        System.out.println("subtotal = " + subtotal );
        System.out.println("GST =" + GST + "   PST = " + PST );
        System.out.println("total = " + total);
    }
}    