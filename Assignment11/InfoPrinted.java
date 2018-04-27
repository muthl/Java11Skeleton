import java.util.Scanner;
class InfoPrinted {
    public static void main(String []args)  {
        Scanner scan = new Scanner(System.in);
        String name, address, city, province, postal;
        
        
        System.out.println("Enter your name");
        name = scan.nextLine();
        
        System.out.println("Enter your address");
        address = scan.nextLine();
        
        System.out.println("Enter your city");
        city = scan.nextLine();
        
        System.out.println("Enter your province");
        province = scan.nextLine();
        
        System.out.println("Enter your portal-code");
        postal = scan.nextLine();
        
        //below I am using the format tool to display the variables.        
        System.out.printf("%s, %s, %s, %s, %s" , name, address, city, province, postal);
        
    }
}