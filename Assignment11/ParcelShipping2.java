import java.util.Scanner;
class ParcelShipping2   {
    public static void main(String []args)  {
        Scanner scan = new Scanner(System.in);
        double height, width, depth, volume, weight, basiccharge, weightcharge, sizecharge, total;  //need a lot of values
        volume = 1.0;
        
        basiccharge = 5; 
        
        boolean oversize, overweight;       
        oversize = false;   overweight = false;
           
        
        sizecharge = 0;
        weightcharge = 0;

        //requests the user to enter package details.
        System.out.println("\nEnter height of parcel (meters)");
        height = scan.nextDouble();
        
        System.out.println("Enter width of parcel  (meters)");
        width = scan.nextDouble();
        
        System.out.println("Enter depth of parcel  (meters)");
        depth = scan.nextDouble();
        
        volume = width * height * depth;
        
        
        while (volume > 0)  {
            
            //checking if extra charges are needed. 
            System.out.println("Enter weight of parcel (kg)");
            weight = scan.nextDouble();
            
            if (volume > 5.0)     {
                oversize = true;    
            }
            else {
                oversize = false;
            }
            
        
            if (weight > 5.0) {     //tests if you need to be charged extra
                    overweight = true;  
            }
            
        
            if (oversize)   {    
                    sizecharge = 20;    
            }
            
        
            if  (overweight)  {  
                        weightcharge = 10;  
            }
            
        
            total = basiccharge + weightcharge + sizecharge;

            //requests the user to enter package details.
            System.out.println("\nOversize charge: $" + sizecharge + "   Overweight charge: $" + weightcharge);
            System.out.println("Total cost: $" + total );
            
            System.out.println("\nEnter height of parcel (meters)");
            height = scan.nextDouble();
        
            System.out.println("Enter width of parcel  (meters)");
            width = scan.nextDouble();
        
            System.out.println("Enter depth of parcel  (meters)");
            depth = scan.nextDouble();
        
        
            volume = width * height * depth;
            
        }
        System.out.println  ("\nYou did not enter a valid volume.");
    }
}