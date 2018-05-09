import java.util.Scanner;
class Deli{
    public static void main(String[] args) {
        String item;
        
        double price, delivery, fee, total;
        Integer expressDelivery;
        
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the item: ");
        item = scan.nextLine();
        System.out.print("Enter the price: ");
        price = scan.nextDouble();
        System.out.print("Express delivery? (0==no, 1==yes): ");
        expressDelivery = scan.nextInt();
        
        if (price < 10) {
            fee = 2;
        }
        else {
            fee = 3;
        }
        if (expressDelivery == 1) {
            delivery = 5;
        }
        else {
            delivery = 0;
        }
        
        total = price + delivery + fee;
        System.out.println("\n\n Invoice: ");
        System.out.println(item + "  " + price);
        System.out.println("delivery   " + (fee + delivery));
        System.out.println("total   " + total);
        
    } 
}