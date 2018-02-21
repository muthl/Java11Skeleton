import java.util.Scanner;
class Features {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a Name");
    String name = scan.nextLine();
    
    System.out.println("Enter an Animal");
    String animal = scan.nextLine();
    
    System.out.println("Enter a body part");
    String body = scan.nextLine();
    
    System.out.format("%s has a %s like a %s",name, body, animal);
    }
}