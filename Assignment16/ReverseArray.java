class ReverseArray {
    public static void main(String[] args) {
        int[] val = { 0, 1, 2, 3 };
        int temp;
        

        System.out.println("Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
        
        temp = val[0];      //stores val[0] as temp
        val[0] = val[3];   //now that val[0] is stored in temp we can edit it. This takes val[0] and changes it to val[3]
        val[3] = temp;      //now that val[3] has been copied we can change val[3] to temo which was originally val 0.
        
        temp = val[1];      //this group of code uses the same process as the previous one.
        val[1] = val[2];
        val[2] = temp;
     
        System.out.println("Reversed Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
    }
}