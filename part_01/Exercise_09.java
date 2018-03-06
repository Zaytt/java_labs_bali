package part_01;

/**
 * Part 1 Exercise 9:
 *
 *      Write the necessary code to display the area of a rectangle, as well as the perimeter of
 *      a rectangle that has a width of 2.4 and a height of 6.4
 *
 */
public class Exercise_09 {

    public static void main(String[] args) {
        double width = 2.4;
        double height = 6.4;

        double area = width*height;
        double perimeter = (2*width) + (2*height);

        System.out.println("Given a rectangle widh a width of " + width + " and a height " + height);
        System.out.println("Its area is " + area);
        System.out.println("Its perimeter is " + perimeter);

    }

}