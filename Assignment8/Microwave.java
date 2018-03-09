import java.util.Scanner;
class Microwave {
    public static void main(String[] args) {
        Integer amount;
        double time, totalTime;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many items are you heating?");
        amount = scan.nextInt();
        System.out.println("How long does it take for 1 item to heat?");
        time = scan.nextDouble();
        if (amount == 1) {
            totalTime = time;
            System.out.println("Put the item in for " + totalTime + " minutes");
        }
        if (amount == 2) {
            totalTime = time/2 + time;
            System.out.println("Put the items in for " + totalTime + " minutes");
        }
        if (amount == 3) {
            totalTime = time*2;
            System.out.println("Put the items in for " + totalTime + " minutes");
        }
        if (amount > 3) {
            System.out.println("Heating more than three items at once is not recommended.");
        }
        
    }
}