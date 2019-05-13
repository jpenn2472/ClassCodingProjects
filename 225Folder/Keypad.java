
import java.util.Scanner;
/**
 *  
 *  This class contains the code for the Keypad assignment.
 *  Put in a string of numbers and translate them into letters
 *  See notes about method. Only used 1 :(. I haven't downloaded netbeans just yet. I'm trying to get my life together lol.
 *  @version 1.0
 *  @Justin H. Pennington
 */
public class Keypad {
	/** Main Method */
	public static void main(String[] args) {
		//Scanner and Input
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a string: ");
		//pull string from keyboard
		String tele = input.nextLine();
		//processing: count letters
		for (int i = 0; i < tele.length(); i++) {
			
		if (Character.isLetter(tele.charAt(i))) {
			System.out.print(getNumber(Character.toUpperCase(tele.charAt(i))));
		}
		else 
			System.out.print(tele.charAt(i));
		}
			System.out.println(); 
	}
	//getNumber method
	//I tried using two strings at first, but once I figured out that I could use >= W for a range (w-z) I knew how to completely write the method
	//However, It's kind of tough to implement another method this way.
	public static int getNumber(char uppercaseLetter) {
		if (uppercaseLetter >= 'W')
			return 9;
		else if (uppercaseLetter >= 'T')
			return 8;
		else if (uppercaseLetter >= 'P')
			return 7;
		else if (uppercaseLetter >= 'M')
			return 6;
		else if (uppercaseLetter >= 'J')
			return 5;
		else if (uppercaseLetter >= 'G')
			return 4;
		else if (uppercaseLetter >= 'D')
			return 3;
		else 
			return 2;
	}
}
