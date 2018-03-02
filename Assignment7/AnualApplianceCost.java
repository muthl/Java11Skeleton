import java.util.Scanner;
class AnualApplianceCost {
    public static void main(String[] args) {
        double cost, amount, total;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Kilowatts-hours does your applience use in a year?");
        amount = scan.nextDouble();
        System.out.println("How much does one kilowatt hour cost?");
        cost = scan.nextDouble();
        total = cost * amount;
        System.out.println("Your applience will cost you " + total + "$ per year");
        
    }
}