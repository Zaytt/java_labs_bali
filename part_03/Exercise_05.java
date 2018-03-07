package part_03;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {

        // read an integer from the user >=1 and <= 999,999,999
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 999,999,999");
        int num = scanner.nextInt();
        if(num > 999999999 || num < 1){
            System.out.println("Number not between 1 and 999,999,999");
        }

        // use the && operator to see if the user's number is divisible by both 4 and 7
        if(num % 7 == 0 && num % 4 == 0  )
            System.out.println("The number you entered is divisible by both 4 and 7.");
        else
            System.out.println("The number you entered is not divisible by both 4 and 7.");

        // use the || operator to see if the user's number is divisible by 4 or 7
        if(num % 7 == 0 || num % 4 == 0  )
            System.out.println("The number you entered is divisible by 4 or 7.");
        else
            System.out.println("The number you entered is not divisible by 4 or 7.");

        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
        if(num % 7 == 0 ^ num % 4 == 0  )
            System.out.println("The number you entered is divisible by either 4 or 7.");
        else
            System.out.println("The number you entered is not exclusively divisible by either 4 or 7.");

        // print out the results

    }
}


