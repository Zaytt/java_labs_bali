package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 *
 *      Receive a number between 0 and 1,000,000,000 from the user.
 *      Use while loop to find the number - when the number is found
 *      exit the loop and print the number to the console.
 *
 */
public class Exercise_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I don't know who you are. I don't know what your number is. \n" +
                "If you are looking for ransom, I can tell you I don't have money. \n" +
                "But what I do have are a very particular set of skills, \n" +
                "skills I have acquired over a very long career. \n" +
                "Skills that make me a nightmare for people like you. \n" +
                "If you close the program now that'll be the end of it. \n" +
                "I will not look for it and I will not pursue you. \n" +
                "But if you don't, I will look for it, I will find it, and I will print it. ");

        int number = scanner.nextInt();
        if(number <= 1000000000 && number >= 0)
        {
            int i = 0;
            while(i != number) i++;
            System.out.println("Found it! it's " + i);

        } else {
            System.out.println("Pfff, your number is either too big or negative, it got no time to look for that.");
        }


    }

}

