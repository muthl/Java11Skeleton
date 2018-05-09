import java.io.*;
import java.util.Arrays;
class ReverserVersion1 {
    public static void main(String[] args) throws IOException {
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int temp;
        // reverse the data
        for (int j = 0; j < data.length / 2; j++) { //data.length needs to be divided by 2 or else 
            temp = data[j];                        //will store the initial value of data in temp 
            data[j] = data[data.length - j - 1];   //data.length starts at 1 so we must subtract that, in addition to subtracting j in order to find the correct array value to edit.
            data[data.length - j - 1] = temp;      //same idea, but now that data[j] has been set we can change the last value subtracted by j
        }
        
        // write out the new data
        for (int j = 0; j < data.length; j++) {     
            System.out.print(data[j] + " ");       //printing out the values starting with the initial one, and moving to the final one.
        }
    }
}