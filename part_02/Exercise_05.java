package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if(number < 10) {
            if(number == 1)
                System.out.println("UNO");
            else if(number == 2)
                System.out.println("DOS");
            else if(number == 3)
                System.out.println("TRES");
            else if(number == 4)
                System.out.println("CUATRO");
            else if(number == 5)
                System.out.println("CINCO");
            else if(number == 6)
                System.out.println("SEIS");
            else if(number == 7)
                System.out.println("SIETE");
            else if(number == 8)
                System.out.println("OCHO");
            else if(number == 9)
                System.out.println("NUEVE");
        } else System.out.println("OTRO");
    }

}

