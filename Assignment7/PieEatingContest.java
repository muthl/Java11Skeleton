import java.util.Scanner;
class PieEatingContest {
    public static void main(String[] args) {
        double weight;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your weight in pounds?");
        weight = scan.nextDouble();
    if(weight <= 220 || weight >= 280.0 ){
        if(weight <= 220) {
            System.out.println("You are too light to compete in this contest");
        }
        if(weight >= 280.0){
            System.out.println("You are too heavy to compete in this contest");
        }
    }
     else{
            System.out.println("You can compete in this contest");
        }
   
}
}