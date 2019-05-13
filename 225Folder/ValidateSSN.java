
import java.util.Scanner;
/**
 * Good for Github!
  *java ValidateSSN
  *Makes sure number entered is SSN!
  * @version 1.0, 9/29/17
  * @author Justin H. Pennington
  */

public class ValidateSSN{

	public static void main(String[] args){
		//Title of program. Execute
		System.out.println("Validate Social Security Number!");

		//Create Scanner
        Scanner input = new Scanner(System.in);
        String ssn;
        
        
        //declare variable
        boolean isValid = false;
       
        
        //input
        System.out.println("Enter valid SSN: DDD-DD-DDDD");
        ssn = input.nextLine();
        
        //Terminates if wrong amount of digits entered
        if (ssn.length() == 11) {
            System.out.println("Correct amount of digits entered. Proceed");
        }
        else if (ssn.length() != 11) {
            System.out.println("Incorrect amount of digits entered. PROGRAM TERMINATED. Data Expunged");
            System.exit(0);
        }
        
        
        //processing
        isValid = Character.isDigit(ssn.charAt(0))
        && Character.isDigit(ssn.charAt(1))
        && Character.isDigit(ssn.charAt(2))
        && (ssn.charAt(3) == '-')
        && Character.isDigit(ssn.charAt(4))
        && Character.isDigit(ssn.charAt(5))
        && (ssn.charAt(6) == '-')
        && Character.isDigit(ssn.charAt(7))
        && Character.isDigit(ssn.charAt(8))
        && Character.isDigit(ssn.charAt(9))
        && Character.isDigit(ssn.charAt(10));
        
        
        //output
        if (isValid) {
        System.out.println(ssn + " is a valid social security number");
        }
        
        else if (true){
        System.out.println(ssn + " is an invalid social security number");
        }
        
    }
}
