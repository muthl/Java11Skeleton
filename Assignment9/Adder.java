import java.util.Scanner ;
public class Adder {
    public static void main (String args[]) {

        Scanner scan = new Scanner(System.in);
        int times, total, number, count;
        total = 0;
        
        System.out.println("How many integers will be added?");
        times = scan.nextInt();

        count = 0; 

        
        while (count < times) {         /* loops the number of times you entered for "times" */

            System.out.println ( "Enter an integer:" );

            number = scan.nextInt ();

            total = total + number;

            count++;
        }
        System.out.println ( "The sum is " + total + ".");
    }
}