import java.util.Scanner;

class InrangeAdder {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        double input, lowEnd, highEnd, sumIn, sumOut;
        sumIn = 0;
        sumOut = 0;
        System.out.println("In-range Adder");
        
        System.out.println("Low end of range: ");
        lowEnd = scan.nextDouble();
        
        System.out.println("High end of range:");
        highEnd = scan.nextDouble();
        
        System.out.println ("\nEnter data: ");
        input = scan.nextDouble();
        
        while (!(input == 0)) {         // Stops loop when input is 0
            
            System.out.println("Enter data: ");
            input = scan.nextDouble();
            if (input >= lowEnd && input <= highEnd) { // Tests whether input is in range
                sumIn = sumIn + input;
            } 
            else if (input <= lowEnd || input >= highEnd){
                sumOut = sumOut + input;
            }
            
        }
        
        
        System.out.println("Sum of in range values: " + sumIn );
        System.out.println("Sum of out of range values: " + sumOut);
        
    }
}