import java.util.Scanner;
class Cents {
    public static void main(String []args)  {
        Scanner scan = new Scanner(System.in);
        Double cents, totalcents, dollars;
        
        System.out.println("How much sense do you have?");  //being super super sneaky with puns (sarcasm)
        totalcents = scan.nextDouble();
        
        cents = totalcents % 100.0;     // finds the remainder when you add your cents together to make a dollar
        dollars = (totalcents - cents) / 100;   
        System.out.println("You have " + dollars + " dollars and " + cents + " cents");
    }
}    