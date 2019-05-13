
import java.util.Scanner;

/**
 *Homework Assignment Guess
 *Create a guessing game using a command line argument
 * 
 * @version 1.0, 11/17/17
 * @author Justin H. Pennington
 */
public class Guess {

    /**
     * Start Here
     */
    public static void main(String[] args) {
        /**
         * Line 21 if loop Tests to make sure user enters a number. Show error prompt if they don't.
         */
        Scanner input = new Scanner(System.in);
        if (args.length != 1) {
            System.out.println("Enter Java Guess n where n is the last number of the range you want to guess between");

            System.exit(0);
        }
        System.out.println(args[0]);
        /**
         * Max will equal the last number in the range. Ex. if 23 is entered int favorite can be between 1-23
         */
        int max = Integer.parseInt(args[0]);
        System.out.println("Guess a number between  1 and " + max);
        /**
         * For loop to allow program to run three times. Yow win/Try again to display if guess is correct/incorrect. Added too high and too low prompt to help with guessing
         */
        for (int i = 0; i < 3; i++) {
            //int guess from user
            int guess = input.nextInt();
            //int favorite generated from Math.random
            int favorite = 1 + (int) (Math.random() * ((max - 1) + 1));
            {
                if (guess == favorite) {
                    System.out.println("You Win");
                    System.exit(1);
                }
                if (guess != favorite) {
                    System.out.println("try again");
                }
                if (guess > favorite) {
                    System.out.println("Guess is too high");
                }
                if (guess < favorite) {
                    System.out.println("guess is too low");
                }
            }
        }
    }
}
