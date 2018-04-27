import java.util.Scanner;
class DrugPotency {
    public static void main(String []args) {
        double percent, effective;
        int month;
        month = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nEnter current effectiveness percent:");
        percent = scan.nextDouble();
        effective = percent;    //declaring the variable
        
        while (effective >= 50)    {    // if the effectiveness is below 50% we want to discard it
            System.out.print("\nMonth: " + month);
            month = month + 1;
            System.out.print("      Effectiveness: " + effective);
            effective = effective - (0.04 * effective);
        }
        System.out.print("\nMonth: " + month);
        System.out.print("      Effectiveness: " + effective);
        System.out.print(" DISCARDED");
    }
}