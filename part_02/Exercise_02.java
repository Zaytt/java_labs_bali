package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 2:
 *
 *      Write the necessary code that reads the radius
 *      and the length of a cylinder from the console
 *      then computes the volume and area and prints the
 *      results to the console.
 *
 *      tip: area = radius * radius * 3.1415 (roughly)
 */

public class Exercise_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of a cylinder");
        double radius = scanner.nextDouble();
        System.out.println("Now enter its length");
        double length = scanner.nextDouble();

        double volume = Math.PI * radius * radius * length;
        double area = 2*(Math.PI * radius * radius) + (Math.PI * radius * 2) * length;

        System.out.println("That cylinder's area is " + area);
        System.out.println("And it's volume is " + volume);


    }


}