import java.util.Scanner;
class Age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long age, days, months, dPM, hours;
        System.out.println("What is your age in years?");
        age = scan.nextInt();
    
        days = 365;
        months = 12;
        hours = 8760;
    
        System.out.println("You are " + age * months + " months old" );
        System.out.println("You are " + age * days + " days old");
        System.out.println("You are " + age * hours + " hours old");
    
    
    
    
    
    
    }
}