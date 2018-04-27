import java.util.Scanner;

class ComboLock {
    public static void main(String[] args) {
        int lockFirst = 6, lockSecond = 12, lockThird = 30;
        int numb;
        Scanner scan = new Scanner(System.in);

        int attempt = 0;
        boolean open = false;

        while (attempt < 3 && !open) {
            // try a combination, setting open to "true" if correct
            boolean correct = true;

            //First Number
            System.out.println("\nEnter first number: ");
            numb = scan.nextInt();

            if (numb < (lockFirst - 3) || numb > (lockFirst + 3))   //if the guessed number is in a range of +/- 3 it is open.
                correct = false;

            //Second Number
            System.out.println("Enter second number: ");
            numb  = scan.nextInt();

            if (numb < (lockSecond - 3) || numb > (lockSecond + 3))
                correct = false;

            //Third Number
            System.out.println("Enter third number: ");
            numb  = scan.nextInt();

            if (numb < (lockThird - 3) || numb > (lockThird + 3))
                correct = false;

            //Result
            if (correct) {
                System.out.println("Lock opens");
                open = true;
            } else
                System.out.println("Lock does not open");

            attempt = attempt + 1;
        }
    }
}
