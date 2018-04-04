import java.util.Scanner;
class RectangleArea {
    public static void main(String[] args)  {
    
        Scanner scan = new Scanner(System.in);
        double X1, X2, Y1, Y2, width, height, area;
        X1 = 0;     X2 = 1;     Y1 = 0;     Y2 = 1;     width = 0;  //initializing variables
        height = 0;     area = 0;
        
        System.out.println("\nComputer Aided Design Program");
        
        
        while (!(X1 == X2 || Y1 == Y2))    {    //Loop while the rectangle is possable
            System.out.println("\nFirst corner X coordinate:");
            X1 = scan.nextDouble();
            System.out.println("First corner Y coordinate:");
            Y1 = scan.nextDouble();
            System.out.println("Second corner X coordinate:");
            X2 = scan.nextDouble();
            System.out.println("Second corner Y coordinate:");
            Y2 = scan.nextDouble();
            
            width = X1 - X2;
            height = Y1 - Y2;
            width = Math.abs(width);        //using the absolute value function to make sure hight and width are positive
            height = Math.abs(height);
            area = width * height;
            System.out.print("\nWidth: " + width + " ");
            System.out.print("Height: " + height + " ");
            System.out.print("Area: " + area + "\n");
        }
        System.out.println("Finished");
    }
}