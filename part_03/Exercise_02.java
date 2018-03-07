package part_03;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task. For instance, create a
 main() method, a multiply(int a, int b) method, and a divide(int a, int b) method. From the main method call the
 multiply and divide methods (both of which return an int) then add the two returned values together and print them out.

 */

public class Exercise_02{
    public static void main(String[] args) {

        int intArray[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Given an array of {");
        for (int x: intArray) {
            System.out.print(x + ", ");
        }
        System.out.println("}");
        System.out.println("Their average is " + average(intArray));
        System.out.println("Their sum is " + average(intArray));
    }

    static double  average(int intArray[]){
        int sum = 0;
        for (int x: intArray) {
            sum += x;
        }
        return (double)sum/intArray.length;
    }

    static int summatory(int intArray[]){
        int sum = 0;
        for (int x: intArray) {
            sum += x;
        }

        return sum;
    }
}