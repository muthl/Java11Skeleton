import java.io.*;

class ThreeSums {
    public static void main(String[] args) {
        int[] data = { 3, 2, 5, 7, 9, -3, 12, 97, 24, 54, -15 };
        
        int sumall = 0, sump = 0, sumn = 0; //sumall = sum of all numbers. sump = sum of all positive numbers. sumn = sum of all negative numbers.
        
        for (int index = 0; index < data.length; index++) { //end the loop at the length of data
            
            sumall += data[index];      //this is equivalent to --> sumall = sumall + data[index];
            
            if (data[index] >= 0) {     //isolates for only positive numbers
                sump += data[index];
            }
            else {                      //isolates for only negative numbers
                sumn += data[index];
            }
        }
        
        
        // write out the three sums
        System.out.println("All numbers added = " + sumall);
        System.out.println("All positive numbers added = " + sump);
        System.out.println("All negative numbers added = " + sumn);
    }
}