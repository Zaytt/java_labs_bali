package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */

import java.text.NumberFormat;
import java.util.Locale;

public class Exercise_11 {
    public static void main(String[] args) {
        int secondsInYear = 60*60*24*365;
        int bornPerYear = secondsInYear/6;
        int deadPerYear = secondsInYear/12;
        int immigratePerYear = secondsInYear/40;
        int population = 380123456;

        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        String populationString = numberFormat.format(population);
        System.out.println( "In a year, " + bornPerYear + " people are born, " + deadPerYear + " die and "+
                immigratePerYear + " immigrate into the country");

        System.out.println("The current population is " + populationString);
        for (int year = 1; year < 4 ; year++){
            population = population + bornPerYear - deadPerYear + immigratePerYear;
            populationString = numberFormat.format(population);
            System.out.println("Population after year " + year + " = " + populationString);
        }
    }
}