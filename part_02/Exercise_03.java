package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 3:
 *
 *      Read in a number in feet from the console
 *      and print out the corresponding length in meters
 *
 *      1 foot = .305 meter.
 */

public class Exercise_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a distance in feet");
        int feet = scanner.nextInt();

        double meters = (double)feet * 0.305;

        System.out.println(feet + " are " + meters + " meters");

    }

}