import java.util.Scanner;
class CheckChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double checking, savings, charge;
        
        System.out.println("How much money is in your checking acount?");
        checking = scan.nextDouble();
        System.out.println("How much money is in your savings acount?");
        savings = scan.nextDouble();
        
        if(checking >= 1000 || savings >= 1500) {
            charge = 0;
            System.out.println("No service charge");
        }
        else {
            charge = 0;
            System.out.println("$0.15 service charge");
        }
    }
}