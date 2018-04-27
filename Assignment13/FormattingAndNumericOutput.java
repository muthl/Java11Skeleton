import java.util.Locale;
import java.text.*;
import java.util.Scanner;

class FormattingAndNumericOutput    {
    public static void main(String []args)  {
        Scanner scan = new Scanner(System.in);
        int i;
        double d;
        System.out.println("This program will loop 3 times"); 
        for (int counter = 0; counter < 3; counter++ )  {
            System.out.println("Input a double value");
            d = scan.nextDouble();
            System.out.println("Input an int value");
            i = scan.nextInt();
            if (counter == 0) {System.out.println( "Default Locale = " + Locale.getDefault() );    // Shows computer default decimal format.
            }
            DecimalFormat a = new DecimalFormat();  //uses local computer decimal format, because no values were inputed 
            System.out.println("Default Locale decimal format for your double value: " + a.format(d));
            System.out.println("Default Locale decimal format for your int value: " + a.format(i));
            DecimalFormat b = new DecimalFormat("###0.0###############;-###0.0###############");  // #'s will remove leading and trailing zeros 
            
            System.out.println(b.format(d));
            System.out.println(b.format(i));
            
        }
    }
}