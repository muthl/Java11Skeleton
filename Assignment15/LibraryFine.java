import java.util.Scanner;
class LibraryFine {
        public static void main(String []args)  {
        Scanner scan = new Scanner(System.in); 
        int days;
        double fine, cost;
        
        String level;
        char lvl; 
        
        do {
            System.out.println("\nHow many days is your book overdue?");
            days = scan.nextInt();
            scan.nextLine();
            if (days == 0) { System.out.println("Bye"); break; }
            
            System.out.println("What is the level of the fine? A, B, C, D, E, or F?");
            level = scan.nextLine();
            
            level = level.trim();
            level = level.toUpperCase();
            lvl = level.charAt(0);
            
            switch (lvl)  {
                case 'A':
                    fine = 0.10;
                    break;
                    
                case 'B':
                    fine = 0.25;
                    break;
                    
                case 'C':
                    fine = 0.50;
                    break;
                    
                case 'D':
                    fine = 1.00;
                    break;
                    
                case 'E': 
                    fine = 2.00;
                    break;
                
                case 'F':
                    fine = 5.00;
                    break;
                    
                default:
                    fine = 0;
                    break;
                    
            }
            cost = fine * days;
            if (fine > 0)   {
                System.out.println("You have been charged $" + cost);   }
                else {System.out.println("You did not enter an acceptable fine value");}
        } while (true);
    }
}