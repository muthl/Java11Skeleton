import java.util.Scanner;

class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guess;
        int number = (int)(Math.random() * 10) + 1; //chooses random number bettween 0 and 11
        int attempt = 0;
        boolean win = false;
        
        while (attempt < 3 && !win) {   //loop while you havent tried 3 times and you dont have the correct number
            System.out.println("Guess a number between 0 and 11");
            guess = scan.nextInt();
            if (guess == number)    {
                win = true;
            }
            if (win)    {
                System.out.println("You win!");
            }
            attempt = attempt + 1;
        }
        if  (!win)  {
            System.out.println("You fail!");
        }
    }
}
