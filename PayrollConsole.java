
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *java Payroll Console
 *Computer Calculates Gross and Net Pay after deductions
 *
 *
 * @version 1.0, 06/12/18
 * @author Justin H. Pennington
 */
public class PayrollConsole {
    public static void main(String[] args) {
        //Scanner and Decimal formatter
        Scanner input = new Scanner(System.in);
        //df for currency df2 for percent
        DecimalFormat df = new DecimalFormat("$#.00");
        DecimalFormat df2 = new DecimalFormat("#%.##");
        //User Input
        System.out.print("Enter employee's name:  ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double workhours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payrate = input.nextDouble();
        System.out.print("Enter federal tax witholding rate: ");
        double fedtax = input.nextDouble();
        System.out.print("Enter state tax witholding rate: ");
        double statetax = input.nextDouble();
        //Processing
        double grosspay = workhours * payrate;
        double fedded = fedtax * grosspay;
        double stateded = statetax * grosspay;
        double deduction = fedded + stateded;
        double netpay = grosspay - deduction;
        //Output
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + workhours);
        System.out.println("Pay Rate: " + payrate);
        System.out.println("Gross Pay: " + df.format(grosspay));
        System.out.println("Deductions: ");
        System.out.println("Federal Withholding " + "(" + df2.format(fedtax) + "):" + df.format(fedded));
        System.out.println("State Withholding "+ "(" + df2.format(statetax) + "):" + df.format(stateded));
        System.out.println("Total Deduction: " + df.format(deduction));
        System.out.println("Net pay: " + df.format(netpay));
    }
}