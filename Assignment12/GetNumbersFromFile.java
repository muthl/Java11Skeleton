import java.util.Scanner;
import java.io.*;

class GetNumbersFromFile {
    public static void main(String[] args) throws IOException {
        int age, IQ, sex, height;
        int totalPeople = 0,totalMales = 0, totalFemales = 0, TMG = 0, totalHeight = 0; 
        int youngestAge = Integer.MAX_VALUE, oldestAge = 0, totalIQ = 0;
        int averageHeightTotal, averageHeightFeet, averageHeightInches;
        
        
        File file = new File("data.txt");   
        Scanner scan = new Scanner(file);   //a scanner that scans a file.
        int data = 0;
        
        while (scan.hasNextInt()) {     
            age = scan.nextInt();
            
            if (age == -1) {
                break;  
            }
            IQ = scan.nextInt();
            sex = scan.nextInt();
            height = scan.nextInt();
            if (sex == 1) {
                totalMales++;
            }
            else if (sex == 0)  {
                totalFemales++;
            }
            if (sex == 1 && IQ > 140 && height > (height/12)) {
                TMG++;
            }
            if (age < youngestAge)  {
                youngestAge = age;
            }
            if (age > oldestAge)   {
                oldestAge = age;
            } 
            totalIQ += IQ;
            totalHeight += height;
            
            
            totalPeople++;
        }
        scan.close();
        
        averageHeightTotal = (totalHeight / totalPeople);
        averageHeightFeet = (averageHeightTotal - (averageHeightTotal % 12)) / 12;
        averageHeightInches = averageHeightTotal % 12;
        
        //prints out the calculations to user interface
        System.out.println("\n\nTotal people: " + totalPeople);
        System.out.println("Males:" + totalMales);
        System.out.println("Females:" + totalFemales);
        System.out.println("Males over 6 feet and greater than 140 IQ: " + TMG);
        System.out.println("Average IQ: " + (totalIQ / totalPeople));
        System.out.println("Average height: " + averageHeightFeet + " Feet " + averageHeightInches + " Inches");
        System.out.println("Oldest age: " + oldestAge);
        System.out.println("Youngest age: " + youngestAge);
    }
}