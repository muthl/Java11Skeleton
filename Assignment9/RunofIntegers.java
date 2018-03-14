import java.util.Scanner;

class RunofIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int count, start, end, times;

        System.out.println("Enter Start:"); 
        start = scan.nextInt();
        System.out.println("Enter End:");
        end = scan.nextInt();
        System.out.println("\n");
        times = end;
        
        count = start - 1;
        
        while (count<times) {       /*loops adding from value start to value end*/
            count = count + 1;
            System.out.println(count);
        }
    }
}