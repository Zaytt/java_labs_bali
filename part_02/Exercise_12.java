package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */

public class Exercise_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Road Trip Calculator");
        System.out.println("Enter the distance you will drive in miles:");
        double miles = scanner.nextDouble();
        System.out.println("Now type your car's MPG");
        double mpg = scanner.nextDouble();
        System.out.println("Finally enter the price per gallon of fuel");
        double priceGallon = scanner.nextDouble();

        double gallonsRequired = miles/mpg;

        System.out.println("The fuel cost of a " + miles + " miles trip using a car with an MPG rate of " + mpg +
                            "\nand a fuel price of $" + priceGallon + " per gallon would be:" );
        System.out.println("$"+gallonsRequired*priceGallon);
    }

}