import java.util.Scanner;
class TimesTable {
    public static void main(String []args)  {
        Scanner scan = new Scanner(System.in); 
        int table, answer, correct, amount, c = 0; //c = number of correctly answered questions
        
        System.out.print("\nEnter a times table: ");
        table = scan.nextInt();
        
        for (int i = 1; i <= table; i++ )    {
            System.out.print("\n" + table + "x" + i + " = ");
            amount = table*i;
            answer = scan.nextInt();
            if (answer == amount)    {System.out.println("Correct!"); c++;} //if you answered correctly add 1 to c (Number of correct answers)
                else {System.out.println("Incorrect");} 
        }
        System.out.println("You got " + c + " out of " + table + " questions right!");
    }
}