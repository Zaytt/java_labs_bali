
package part_02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets calculate the future value of your investment!!");
        System.out.println("Enter the investment amount:");
        double investment = scanner.nextDouble();
        System.out.println("Now type the interest rate");
        double interestRate = scanner.nextDouble();
        System.out.println("Finally enter the years of duration of the investment");
        double years = scanner.nextDouble();
        int compoundPerYear = 1;

        double finalValue = investment * Math.pow((1 + ((interestRate/100.00)/compoundPerYear)), years);

        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        String investmentString = numberFormat.format(investment);

        System.out.println( "So, if you invested $" + investmentString + " for " + (int)years + " years at a " +
                (int)interestRate + "% rate you would have ");

        investmentString = numberFormat.format(finalValue);
        System.out.println("$"+investmentString);
    }

}


