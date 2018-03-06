package part_01;

/**
 * Part 1 Exercise 6:
 *
 *      Write the necessary code to print out the result of the following:
 *
 *￼         1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while(i < 17){
            sum += i;
            i += 2;
        }

        System.out.print("1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17 = ");
        System.out.println(sum);
    }
}
