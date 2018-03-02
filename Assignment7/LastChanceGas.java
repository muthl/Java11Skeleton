import java.util.Scanner;
class LastChanceGas {
    public static void main(String[] args) {
        final double tank, gage, mpg, range;
        Scanner scan = new Scanner(System.in);
        System.out.println("Tank Capacity");
        tank = scan.nextDouble();
        
        System.out.println("Gage reading:");
        gage = scan.nextDouble();
        
        System.out.println("Miles per gallon:");
        mpg = scan.nextDouble();
        
        range = (gage/100) * tank * mpg;
        
    if(range >= 200){
        System.out.println("You can make it!");
    }
    else {
    System.out.println("Get Gas!");
    }
    }
}