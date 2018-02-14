public class Concert {
    public static void main(String[] args) {
        double price = 23.45;
        double people = 7;
        System.out.println("Price = $" + people * price );
        double taxAmount = 0.12 * people * price;
        System.out.println( "Tax will cost $" + taxAmount );
        double totalPrice = taxAmount + (people * price);
        System.out.println("Total Price = $" + totalPrice);
    }
}