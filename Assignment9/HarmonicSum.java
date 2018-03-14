import java.util.Scanner ;
public class HarmonicSum {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int N, number, count;
        double sum, total;
        total = 0;
        
        System.out.println("Enter N");
        N = scan.nextInt();

        count = 1; 

        
        while (count <= N) {         /* loops the number of times you entered for "N" */
            total = total + 1d/count;   //creats a series
            count = count + 1;
        }
        
        System.out.println ( "The sum is " + total + ".");
    }
}