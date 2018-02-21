import java.util.Scanner;
class Age {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long age, days, months, dPM, dY, math;
    System.out.println("What is your age in years?");
    age = scan.nextInt();
    
    days = 365;
    months = 12;
    dPM = 31;
    dY = age * days;
    
    System.out.println("You are " + age * days + " days old");
    System.out.println("You are " + dY/dPM + " Months " + dY % dPM + " and days old." );
    
    
    
    
    
    
    }
}