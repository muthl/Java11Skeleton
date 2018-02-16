import java.util.Scanner;

public class AddTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double first, second, third, sum;      // declaration of int variables

        System.out.print("Enter first number: ");
        first = scan.nextDouble();       // read chars and convert to int

        System.out.print("Enter second number: ");
        second = scan.nextDouble();      // read chars and convert to int
        
        System.out.print("Enter third number: ");
        third = scan.nextDouble();

        sum = first + second + third;         // add the two ints, put result in sum

        System.out.println("The sum of " + first + " plus " + second + " plus " + third + " is " + sum);
    }
}