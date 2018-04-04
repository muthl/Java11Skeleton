import java.util.Scanner;

class ShippingCalc {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        double weight, cost, charge;
        cost = 0;
        weight = 0;
        charge = 0;
        
        System.out.print("Weight of Order:");
        weight = scan.nextDouble();
        
        
        //keep going while weight is greater than 0
        while (!(weight <= 0)) {
            if (weight > 10){
            charge = (weight - 10) * 0.25;
            cost = charge + 3;
            System.out.println("Shipping Cost: $" + cost);
        }
            else{
            cost = 3;
            System.out.println("Shipping Cost: $" + cost);
            }
            System.out.print("\nWeight of Order: ");
            weight = scan.nextDouble();
        }

        System.out.println("Bye");
    }
}