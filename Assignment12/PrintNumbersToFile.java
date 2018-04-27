import java.util.Scanner;
import java.io.*;

class PrintNumbersToFile {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int age = 0;
        int IQ = 0;
        int sex = 0;
        int height = 0;
        
        File file = new File("data.txt");   // a new file to store information
        PrintStream print = new PrintStream(file);

        while (true) { //infinite loop (untill "break;")
            System.out.println("\nEnter age (age = -1 to exit):");
            age = scan.nextInt();
            print.println(age);
            
            if (age == -1)   {  //will end the while loop
                break;
            }
            
            System.out.println("Enter IQ:");
            IQ = scan.nextInt();
            print.println(IQ);
            
            System.out.println("Enter Sex (1 for male, 0 for female):");
            sex = scan.nextInt();
            print.println(sex);
            
            System.out.println("Height (inches);");
            height = scan.nextInt();
            print.println(height);
        }

        print.close();
    }
}