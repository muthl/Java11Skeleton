import java.util.Scanner;
import java.util.Random;

class SumRandom {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random generateRandom = new Random();
        int num, counter;

        for (counter = 1; counter <= 100; counter++) {
            num = generateRandom.nextInt(25) + 1;   //random number generator
            System.out.println(counter + " + " + num  + " = " + (counter + num));
        }



    }
}