import java.util.Scanner;
class TirePressure2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Integer frontR, frontL, rearR, rearL;
        boolean goodPressure = true;
        
        System.out.println("\nInput front right pressure");
        frontR = scan.nextInt();
        if (frontR < 35 || frontR > 45) {
            goodPressure = false;
            System.out.println("Warning: pressure is out of range");
        }
        
        System.out.println("\nInput front left pressure");
        frontL = scan.nextInt();
        if (frontL < 35 || frontL > 45) {
            goodPressure = false;
            System.out.println("Warning: pressure is out of range");
        }
        
        System.out.println("\nInput rear left pressure");
        rearR = scan.nextInt();
        if (rearR < 35 || rearR > 45) {
            goodPressure = false;
            System.out.println("Warning: pressure is out of range");
        }
        
        System.out.println("\nInput rear left pressure");
        rearL = scan.nextInt();
        if (rearL < 35 || rearL > 45) {
            goodPressure = false;
            System.out.println("Warning: pressure is out of range");
        }
        
        
        if (frontR == frontL && rearR == rearL) {
            if (goodPressure == false) {
                System.out.println("\nInflation is BAD");
            }
            else {
                System.out.println("\nInflation is OK");
            }
        }
        else {
            System.out.println("Inflation is BAD");
        }
    }
}