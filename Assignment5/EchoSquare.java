import java.util.Scanner;

public class EchoSquare {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        long num, square;      // declare two int variables

        System.out.println("Enter an integer:");
        num = scan.nextLong();
        square = num * num ;  // compute the square

        System.out.println("The square of " + num + " is " + square);
    }
}