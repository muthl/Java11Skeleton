import java.util.Scanner;
class Paint {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double width, hight, area, price;
    System.out.println("Enter Width of Rectangle");
    width = scan.nextDouble();
    
    System.out.println("Enter a hight of Rectangle");
    hight = scan.nextDouble();
    
    System.out.println("Enter your cost of paint per square unit");
    price = scan.nextDouble();
    
    
    area = width * hight;
    System.out.println("The price of your paint will be : " + area * price + "$");
    
    
    }
}