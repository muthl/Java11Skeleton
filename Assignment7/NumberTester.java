import java.util.Scanner;
class NumberTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter an integer:");
        num = scan.nextInt();
        if (num < 0) {
            System.out.println("The number " + num + " is negative"); // true-branch
            System.out.println("negative numbers are less than zero"); // true-branch
        } else {
            System.out.println("The number " + num + " is positive"); // false-branch
            System.out.print ("positive numbers are greater"); // false-branch
            System.out.println("than zero"); // false-branch
        }
        System.out.println("Good-bye for now"); // always executed
    }
}