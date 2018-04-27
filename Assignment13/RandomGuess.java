import java.util.Scanner;
import java.util.Random;

class RandomGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generaterandom = new Random();

        int num, guess, amount;
        num = generaterandom.nextInt(100) + 1;
        for (int i = 0; i <= 5; i++) {  //end loop when i > 5
            System.out.println("Guess a number between 0 and 100");
            guess = scan.nextInt();
            if (guess != num)   {
                amount = num - guess;
                System.out.println("\nYou were off by " + Math.abs(amount)); //using Math.abs to tell you the amount you were off, but not in which direction.
                System.out.println("You have " + (5 - i) + " tries remaining");
            }
            
            if (guess == num)   {
                System.out.println("\nYou win!");
                break;
            }
            
        }
    }
}