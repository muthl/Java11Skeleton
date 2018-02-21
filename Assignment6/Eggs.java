import java.util.Scanner;
class Eggs {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long amount;
    System.out.println("How many eggs do you have?");
    amount = scan.nextLong();
    
    System.out.println("You have " + amount/12 + " dozen eggs with " + amount%12 + " left over");
    
    
    
    
    
    
    }
}