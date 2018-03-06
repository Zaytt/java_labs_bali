package part_01;

/**
 * Part 1 Exercise 8:
 *
 *      Write the necessary code that prints out the area
 *      and perimeter of a circle with a radius of 3.14
 *
 *
 */
public class Exercise_08 {
    public static void main(String[] args) {
        double rad = 10;

        double area = Math.PI * (rad*rad);
        double perimeter = Math.PI * rad * 2;

        System.out.println("Given a circle with a radius of " + rad );
        System.out.println("Its area is " + area);
        System.out.println("Its perimeter is " + perimeter);
    }
}
