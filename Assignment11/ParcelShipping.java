import java.util.Scanner;
class ParcelShipping   {
    public static void main(String []args)  {
        Scanner scan = new Scanner(System.in);
        double height, width, depth, volume, weight, basiccharge, weightcharge, sizecharge, total;
        volume = 1.0;
        
        basiccharge = 5; 
        
        boolean oversize, overweight;
        oversize = false;   overweight = false;
           
        
        sizecharge = 0;
        weightcharge = 0;
        
        System.out.println("\nEnter height of parcel (meters)");
        height = scan.nextDouble();
        
        System.out.println("Enter width of parcel  (meters)");
        width = scan.nextDouble();
        
        System.out.println("Enter depth of parcel  (meters)");
        depth = scan.nextDouble();
        
        volume = width * height * depth;
        
        
            
            //checking whether charges are needed
            System.out.println("Enter weight of parcel (kg)");
            weight = scan.nextDouble();
            
            if (volume > 5.0)     {
                oversize = true;    
            }
            else {
                oversize = false;
            }
            
        
            if (weight > 5.0) {   
                    overweight = true;  
            }
            
        
            if (oversize)   {    
                    sizecharge = 20;    
            }
            
        
            if  (overweight)  {  
                        weightcharge = 10;  
            }
            
            //total charges on shipment
            total = basiccharge + weightcharge + sizecharge;
        
            System.out.println("\nOversize charge: $" + sizecharge + "   Overweight charge: $" + weightcharge);
            System.out.println("Total cost: $" + total );
            
          
            
        
        System.out.println  ("\nBye");
    }
}