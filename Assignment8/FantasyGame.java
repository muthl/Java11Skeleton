import java.util.Scanner;
class FantasyGame {
    public static void main(String[] args) {
        Integer strength, health, luck;
        String name;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to Yertle's Quest");
        System.out.println("Enter the name of your character:");
        name = scan.nextLine();
        
        System.out.println("Enter strength (1-10)");
        strength = scan.nextInt();
        
        System.out.println("Enter health (1-10)");
        health = scan.nextInt();
        
        System.out.println("Enter luck (1-10)");
        luck = scan.nextInt();
        
        if (strength + health + luck > 15) {
            System.out.println("You have given your character too many points.");
            System.out.println("Default values have been assigned: ");
            strength = 5;
            health = 5;
            luck = 5;
            System.out.println(name + ", strength: " + strength + ", health: " + health + ", luck: " + luck ); 
        }
        else { 
            System.out.println(name + ", strength: " + strength + ", health: " + health + ", luck: " + luck );
        }
    }
}