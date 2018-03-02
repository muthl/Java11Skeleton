import java.util.Scanner;
class OrderChecker {
    public static void main(String[] args) {
        double bolts, nuts, washers, total;
        final double boltprice, nutprice, washerprice;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Number of bolts: ");
        bolts = scan.nextDouble();
        
        System.out.print("Number of nuts: ");
        nuts = scan.nextDouble();
        
        System.out.print("Number of washers: ");
        washers = scan.nextDouble();
        
        boltprice = bolts*0.05;
        nutprice = nuts*0.03;
        washerprice = washers*0.01;
        
        System.out.println("\n");
        total = boltprice + nutprice + washerprice; 
    if(nuts >= bolts){
        if(washers >= 2*bolts){
            System.out.println("Order is OK");
            System.out.println("Total cost:" + total + "$"); 
        }
        else {
            System.out.println("Check the Order: Too few washers");
            System.out.println("Total cost:" + total + "$"); 
        }
    }
    else {
        System.out.println("Check Order: Too few nuts");
        if(washers >= 2*bolts) {
            System.out.println("Total cost:" + total + "$");
        }
        else{
        System.out.println("Check Order: Too few washers");
        System.out.println("Total cost:" + total + "$");
        }
    }
    }
}