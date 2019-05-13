
import java.util.Scanner;

/**
 * Exercise 7.9 Create a method that pulls the highest element out of a 10 digit
 * user entered array Need help with the display methods
 *
 * @version 1.0, 11/15/17
 * @author Justin H. Pennington
 */
public class ArrayMax {
//Main Method

    /**
     * Begin Execution of the program
     *
     * @param args, max
     */
    public static void main(String[] args) {
        //import Scanner
        Scanner input = new Scanner(System.in);
        //Print out prompt
        System.out.println("Enter 10 values to see which one is the max");
        //Create array maxList
        double[] maxList = new double[10];
        //for loop allows user input into the array
        for (int i = 0; i < maxList.length; i++) {
            maxList[i] = input.nextDouble();
            double max = max(maxList);
            // System.out.println(indexOfMax);
        }
    }

    //Max Method
    public static double max(double[] array) {
        //Declare vars for max loop
        double[] maxList = new double[11];
        double most = maxList[0];
        double indexOfMax = 0;
        // max loop:
        for (int i = 0; i < maxList.length; i++) {
            if (maxList[i] > most) {
                most = maxList[i];
                indexOfMax = i;
                // System.out.println(indexOfMax);
            }

        }
        return indexOfMax;
    }
    // public static void displayOutput(double number, double[] numbers) {
    //    number = indexOfMax;

}
