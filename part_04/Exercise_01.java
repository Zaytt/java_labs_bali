package part_04;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.util.InputMismatchException;
import java.util.Scanner;
/**

 Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 The print out the 9th, 7th, 5th, 3rd, and 1st.

 Example input: 1,2,3,4,5,6,7,8,9,10
 Example output: 2,4,6,8,10,9,7,5,3,1

 Output can be on one line or many lines. However you like.

 */
public class Exercise_01{

    public static void main(String[] args) {


        int array[] = new int[10];
        int i = 0;
        boolean wrongType = false;
        System.out.println("Please enter integer values");
        do{
            try{
                while(i <10){
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Value " + (i+1) + ": ");
                    array[i] = scanner.nextInt();
                    i++;
                    wrongType = false;
                }
            } catch (InputMismatchException exception){
                wrongType = true;
                System.out.println("Please enter only integer values. Try again.");
            }
        } while(wrongType);

        int j = 1;
        while(j < array.length){
            System.out.print(array[j]);
            j += 2;
        }
        System.out.println();
        j = array.length-2;
        while(j >= 0){
            System.out.print(array[j]);
            j -= 2;
        }

    }
}