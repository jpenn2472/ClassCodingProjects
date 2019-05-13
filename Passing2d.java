
import java.util.Scanner;

/**
 * CIS 225
 *build a program that sums work hours for a specific column (Columns represent workHours)
 *
 * @Justin H. Pennington
 *version 1.0
 */
public class Passing2d {
/**Start Here
 * Main Method
 * @param args 
 */
    public static void main(String[] args) {
        //declare vars
        //import Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number 0-6 to view work hours for that day. 0 being sunday and 7 being saturday");
        int column = 0;
        column = input.nextInt();
        double[][] workHours = getArray();
        
        double total = sumColumn(column, workHours);
        
        solution(total);
    }
    
    /** getArray
     * 
     * Passes workHours into an array! 
     */
       public static double[][] getArray() {
             double[][] workHours = 
             {{0, 4.3, 3, 4, 5, 8, 0},
                {0, 3, 4.2, 3, 3, 4, 4},
                {0, 3, 4, 3, 3, 2, 2},
                {0, 3, 4.9, 7.47, 3, 4, 1},
                {0, 5, 4, 3, 6.3, 3, 8},
                {0, 4, 4.12, 6, 3, 3.4, 0},
                {0, 7, 4, 8, 3, 8.1, 0},
                {0, 3, 5.3, 9, 2, 7, 9.17}
                };
             return workHours;
    }
/** sumColumn
 * Processes total for specified column
 * @param column
 * @param workHours
 * @return total
 */
    public static double sumColumn(int column,double[][] workHours) {
   if (column > 6) {
       System.out.println("Invalid Column Number");
       System.exit(0);
   }
   double total = 0;
   for(int i = 0; i < workHours.length; i++) {
       total = total + workHours[i][column];
   }return total;
    }
/**
 * Method solution prints out column totals
 *  
 */
public static void solution (double total) {
System.out.println("The sum of the column is " + total);
}
}
