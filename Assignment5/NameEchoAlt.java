import java.util.Scanner;
class NameEchoAlt {
    public static void main (String[] args) {
        String inData;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: "); //your input will be written on the same line as system.out.print
        inData = scan.nextLine();
        System.out.println("Hello, " + inData);
    }
}