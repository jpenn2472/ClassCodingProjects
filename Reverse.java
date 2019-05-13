import java.util.Scanner;
/**
 * Github!
 * Reverse
 * Build a program that reverses input from the user
 * 
 * @version 1.0, 10/20/17
 * @author Justin H. Pennington
 */
 
public class Reverse{
/**
 * Starting point for execution of reverse program!
 *
 */
 public static void main(String[] args) {
	 //Scanner input
  Scanner input = new Scanner(System.in);
  // Enter word
  System.out.print("Enter a Word:");
  //Pull Strings from scanner
  	String word = input.nextLine();
  	String reverse = "";
 //for loop. word.length decides how long the String is
  for (int i = word.length() - 1; i >= 0; i--) {
   reverse += word.charAt(i);
  } //Output: String is reversed
  System.out.println("The reversed input is " + reverse);
 
 }
 
}