import java.util.Scanner;
import java.util.Random;

class SumRandom {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random generateRandom = new Random();
        int num, counter, total = 0;

        for (counter = 1; counter <= 100; counter++) {
            num = generateRandom.nextInt(25) + 1;   //random number generator
            total += num;
        }
        System.out.println("Total of all random numbers = " + total );


    }
}