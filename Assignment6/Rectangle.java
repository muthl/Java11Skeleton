import java.util.Scanner;
class Rectangle {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double width, hight, area;
    System.out.println("Enter Width of Rectangle");
    width = scan.nextDouble();
    
    System.out.println("Enter a hight of Rectangle");
    hight = scan.nextDouble();
    
    area = width * hight;
    System.out.println("The area of your Rectangle is: " + area + " units");
    
    
    }
}