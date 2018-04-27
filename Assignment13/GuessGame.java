import java.util.Scanner;
import java.util.Random;

class GuessGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random generateRandom = new Random();
        int num, guess, again;
        
        
        do {
            again = 0;
            num = generateRandom.nextInt(100) + 1;
            do{
                System.out.print("Guess the number: ");
                guess = scan.nextInt();

                //checking the value for some help with the guess
                if (guess > num)    
                    System.out.println("Too High");

                if (guess < num)
                    System.out.println("Too Low");
                
                if (guess == num)   {
                    System.out.println("\nYou win! Do you want to play again? Type 1 for yes or 0 for no.");
                    again = scan.nextInt(); 
                }
            } while (guess != num); //repeat untill you guess the number
        }

        while (again != 0); //do the whole loop again if you entered 1
        
        System.out.println("Thank you for playing");
    }
}