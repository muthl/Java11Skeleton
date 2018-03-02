import java.util.Scanner;
class DiscountPrices {
    public static void main(String[] args) {
        double cost, discount;
        Scanner scan = new Scanner(System.in);
        System.out.println("What was the cost of your total purchase? (in dollars)");
        cost = scan.nextDouble();
    if(cost >= 10.0){
        System.out.println("Your discounted price is: " + cost * 0.90 + "$");
    }
    else {
    System.out.println("You recieved no discount, your price was: " + cost + "$");
    }
    }
}