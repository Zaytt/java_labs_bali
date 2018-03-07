package part_04;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */


public class Exercise_05 {

    public static void main(String[] strings) {
        int array[] = new int[2018];
        for(int i = 0; i <= 2017; i++) array[i] = i;
        for (int x: array) System.out.println(x);
    }
}