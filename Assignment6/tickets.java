import java.util.Scanner;
class tickets {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double amount, price;
    System.out.println("How many tickets do you wish to purchase?");
    amount = scan.nextDouble();
    
    System.out.println("What is the cost of one ticket?");
    price = scan.nextDouble();
    
    
    System.out.println("The cost of " + amount + " tickets is " + amount * price + " dollars");
    
    
    }
}