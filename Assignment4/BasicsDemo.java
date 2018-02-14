public class BasicsDemo {
       public static void main(String[] args) {
        for (int current = 1; current <= 10; current++) {
            double price = 1.47;
            System.out.println (current + " Items = $" + current*price);

            System.out.println ("Anything between the { and } will repeat 10 times");
        }
        System.out.println ( "Finished counting");
    }
}