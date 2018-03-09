import java.util.Scanner;
class TirePressure1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer frontR, frontL, rearR, rearL;
        
        System.out.println("Input front right pressure");
        frontR = scan.nextInt();
        System.out.println("Input front left pressure");
        frontL = scan.nextInt();
        System.out.println("Input rear left pressure");
        rearR = scan.nextInt();
        System.out.println("Input rear left pressure");
        rearL = scan.nextInt();
        if(frontR == frontL && rearR == rearL) {
            System.out.println("Inflation is OK");
        }
        else {
            System.out.println("Inflation is BAD");
        }
    }
}