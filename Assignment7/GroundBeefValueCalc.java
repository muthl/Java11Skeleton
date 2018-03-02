import java.util.Scanner;
class GroundBeefValueCalc {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double A, B, percentA, percentB, costA, costB;
    
    System.out.println("The price per pound of package A:");
    A = scan.nextDouble();
    System.out.println("Percent lean package A:");
    percentA = scan.nextDouble();
    costA = A/(percentA/100);
    
    System.out.println("The price per pound of package B:");
    B = scan.nextDouble();
    System.out.println("Percent lean package B:");
    percentB = scan.nextDouble();
    costB = B/(percentB/100);
    
    System.out.println("\nPackage A cost per pound of lean is: " + costA + "$");
    System.out.println("Package B cost per pound of lean is: " + costB + "$");
    if(costA < costB){
        System.out.println("Package A is the best value");    
    }
    if(costB < costA){
        System.out.println("Package B is the best value");
    }
    if(costA == costB) {
        System.out.println("Package A and Package B are equal in value");
    }
}
}