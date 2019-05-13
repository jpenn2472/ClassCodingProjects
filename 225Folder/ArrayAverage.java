
import java.util.Scanner;
/**
 * Assignment: ArrayAverage
 * Design program that takes 5 ints from the user and calculates sum and average
 * 
 * @version 1.0 11/3/17
 *@Justin H. Pennington
 */
public class ArrayAverage {
    /**
     * Starting point for execution of program
     */
    public static void main(String[] args) {
        //Import Scanner
        Scanner input = new Scanner(System.in);
        //Input: Ask 5 integers from user
        System.out.println("Enter 5 integers: the program will calculate the sum and average of these integers");
        //Declare Variables
        double[] myList = new double[5];
        double total = 0;
        // Debug: System.out.print("Enter " + myList.length + " values:");
        //Processing: For loop process input and calculate total
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
            total += myList[i];
        } //Easy hard code average equation
        double average = total / myList.length;
        //Output
        System.out.println("The sum of the numbers is " + total);
        System.out.printf("The average of the numbers entered: " + "%.3f%n", average); //+ "The average of the numbers is " + average);
    }

}
