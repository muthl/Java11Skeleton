import java.io.*;
import java.util.Arrays;

class TwoLargest {
  public static void main(String[] args) {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    int max1, max2; 
    
    max1 = data[0];
    max2 = data[0];
    
    
    for (int index= 0; index < data.length; index++) {
        if (data[index] > max1)   { //if the value of data is greater than max1 make max1 that value.
            max1 = data[index];
        }
    }
    
    for (int index= 0; index < data.length; index++) {
        if (data[index] > max2 && data[index] < max1)   {   //same idea but if max1 already holds that value, don't use it.
            max2 = data[index]; 
        }
    }
      
    System.out.println(Arrays.toString(data));
    System.out.println("Largest value = " + max1);
    System.out.println("Second largest value = " + max2);

  }
}