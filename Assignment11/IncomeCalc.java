import java.util.Scanner;
class IncomeCalc    {
    public static void main(String []args)  {
        Scanner scan = new Scanner(System.in);
        Double hours, wage, income, taxcost, gross;
        
        System.out.println("How much do you earn per hour?");
        wage = scan.nextDouble();
        
        System.out.println("How many hours did you work?");
        hours = scan.nextDouble();
        

        //calculations
        income = hours * wage;
        taxcost = income * 0.3;
        gross = income - taxcost;
        
        System.out.println("Total tax is: " + taxcost + "   Gross income is: " + gross);
        
    }
}    