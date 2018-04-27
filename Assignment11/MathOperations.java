import java.util.Scanner;
class MathOperations    {
    public static void main(String []args)  {
        Scanner scan = new Scanner(System.in);
        double a, b;
        
        System.out.println("Enter first number");
        a = scan.nextDouble();  //asigning first value to "a"
        
        System.out.println("Enter second number");
        b = scan.nextDouble();  //asigning second value to "b"
        
        System.out.println(a + " + " + b + " = " + (a + b) );
        System.out.println(a + " - " + b + " = " + (a - b) );
        System.out.println(a + " * " + b + " = " + (a * b) );
        System.out.println(a + " / " + b + " = " + (a / b) );
    }
}