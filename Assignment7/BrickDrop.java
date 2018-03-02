import java.util.Scanner;
class BrickDrop {
    public static void main (String[] args ) {
    double t, d, g;
    g = 32.174;
    Scanner scan = new Scanner(System.in);
    System.out.println("How long does the brick fall for in seconds?");
    t = scan.nextDouble();
    d = (1.0/2.0) * t * t * g ;
    System.out.println("The brick fell " + d + " feet");
    }
}
