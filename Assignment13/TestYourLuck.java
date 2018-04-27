import java.util.Scanner;
import java.util.Random;

class TestYourLuck {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generaterandom = new Random();

        int num, guess, amount, correct, range;
        correct = 0;
        
        for (int i = 0; i < 10; i++) {
            boolean answer = false;
            num = generaterandom.nextInt(100) + 1;
            System.out.println("If you think the number is between 1 and 51 enter 1, if you think its between 50 and 100, enter 0.");
            guess = scan.nextInt();
            if (num > 50 && guess == 0)   {
                answer = true;
            }
            if (num < 51 && guess == 1) {
                answer = true;
            }
            if (answer == true)   { //if you guessed right, your correct answers are increase, this stores that.
                correct++;
            }
        }
        
        if (correct > 5) {  // you are lucky of you get mroe than 5 right
            System.out.println("You got " + correct + " out of 10 correct, you are lucky :)");
        }
        else {
            System.out.println("You got " + correct + " out of 10 correct, you are not lucky :(");
        }
    }   
}