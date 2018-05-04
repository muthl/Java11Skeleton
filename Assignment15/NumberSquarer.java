import java.util.Scanner;
class NumberSquarer {
        public static void main(String []args)  {
        Scanner scan = new Scanner(System.in); 
        int num, amount; 
        
        
        do     {
            System.out.print("\nEnter number: ");
            num = scan.nextInt();
            if (num == 0) { System.out.println("Bye"); break;    }  //break if num = 0
            amount = (int)Math.pow(num, 2);   //num ^ 2
            System.out.println(num + "^2 = " + amount);
        } while (true);
    }
}