package part_02;


import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an ammount of minutes");
        int minutes = scanner.nextInt();
        double minutesInDay = 60*24;
        double minutesInYear = minutesInDay*365;
        double days = (double)minutes/minutesInDay;
        double years = (double)minutes/minutesInYear;
        System.out.println(minutes + " are "+ days + " days or " + years + " years.");
    }

}


