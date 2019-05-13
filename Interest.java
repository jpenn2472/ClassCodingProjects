import java.util.Scanner;
/**
 * Interest
 * Prepare interest calculator that prints out a table of how much the price increases over a set of months
 *
 * @version 1.0, 10/1817
 * @author Justin Pennington
 */

public class Interest {
	/**
	 * Start Here
	 */
	public static void main(String[] args) {
		//Display instructions
		System.out.println("Enter the product cost, interest percentage, and amount of months!");
		//import Scanner
		Scanner input = new Scanner(System.in);
		//Name Variables
		float cost = input.nextFloat();
		float interest = input.nextFloat();
		int mont = input.nextInt();
		float accrued;
		
		
		//For loop: count every month: Start with 1.
		for (float i = 1; i < mont; i++) {
			accrued = ((cost * 2) * (interest)/1200);
			//created float total to simplify output
			float total = ((accrued * i) + cost);
			//Output
				System.out.println("CD Value  " +  (" Months"));
				System.out.println(total + "  "+ i);
				
		}
						
		}
}
