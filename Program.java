//import stuff here
import java.util.Scanner;
//Your code here
public class Program8 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        int numberOne = 0;
        int numberTwo = 0;
        int sum = 0;
        int difference = 0;
        int product = 0;
        double average = 0;
        int absoluteValue = 0;
        int maximum = 0;
        int minimum = 0;
        
        System.out.println("Enter first number: ");
        numberOne = myScanner.nextInt();
        
        System.out.println("Enter second number: ");
        numberTwo = myScanner.nextInt();
        
        sum = numberOne + numberTwo;
        difference = numberOne - numberTwo;
        product = numberOne * numberTwo;
        average = (double) sum/2;
        absoluteValue = Math.abs(difference);
        
        if (numberOne > numberTwo){
            maximum = numberOne;
            minimum = numberTwo;
        }
        else{
            maximum = numberTwo;
            minimum = numberOne;
        }
        
        System.out.println("The original numbers are " + numberOne + " " + numberTwo);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Average = " + average);
        System.out.println("Absolute Value = " + absoluteValue);
        System.out.println("Maxiumum = " + maximum);
        System.out.println("Minimum = " + minimum);
        
        System.out.println();
        System.out.println("This program was written by: ");
        System.out.println("Kyle Tan on 9.6.24 in 1st period");
        
    }
}
//Paste console output below:
/*

Enter first number: 
13
Enter second number: 
20
The original numbers are 13 20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Absolute Value = 7
Maxiumum = 20
Minimum = 13

This program was written by: 
Kyle Tan on 9.6.24 in 1st period

*/
