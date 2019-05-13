
import java.util.Scanner;

/**
 * Excercsie 8.1 Develop a program that sums a two dimensional arrays elements
 *
 * @ version 1.0
 * @author Justin H. Pennington
 */
public class ColSum {

    /**
     * Start Here!
     */
    public static void main(String[] args) {
        /**
         * Develop string to display if incorrect arguements are entered
         *
         */
        String usage = "usage: java ColumnSum n /n/t where n is the column to add";
        //int column = Integer.parseInt(args[0]);
        //Make sure the user provides one integer
        //via the command line
        //declare max
        int max = Integer.parseInt(args[0]);
        /**
         * If statement checks if length is long enough entered in terminal
         */
        if (args.length != 1) {
            System.out.println(usage);
            System.exit(1);
        }
        /**
         * Array WorkHours used in processing method
         */
        double[][] workHours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}};
        /**
         * For loops for array counters, Print line pulls from sumColumn method
         */
        for (int row = 0; row < 1; row++) {
            for (int column = 0; column < Integer.parseInt(args[0]) + 1; column++) {
                System.out.println("Sum of the elements at column " + column
                        + " is " + sumColumn(workHours, column));
            }
        }
    }

    /**
     * Method sumColumn Sums column of numbers in array workHours
     *
     */
    public static double sumColumn(double[][] workHours, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < workHours.length; row++) {
            sum += workHours[row][columnIndex];
        }
        return sum;
    }

}
