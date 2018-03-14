import java.util.Scanner;

class WordsDots {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count;
        String inputString1, inputString2;
        int times, length1, length2;
        
        System.out.println("Enter first word:");
        inputString1 = scan.nextLine();
        
        System.out.println("Enter second word:");
        inputString2 = scan.nextLine();
        
        length1 = inputString1.length();
        length2 = inputString2.length();
        times = 30 - (length1 + length2); // max number of chars - total chars used
        count = 1;
        
        System.out.print(inputString1);
        while (count<=times) {              /* Incrimental Loop */
            System.out.print(".");
            count = count + 1;
        }
        System.out.print(inputString2);
    }
}