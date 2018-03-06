package part_01;

 /**
 * Part 1 Exercise 4:
 *      Write the necessary code to print the following table to the console:
 *
 *      a   a*2 a*4
 *      1   2   4
 *      ....
 *      4   8   16
 *
 */
public class Exercise_04 {


     public static void main(String[] args) {
         System.out.println("a   a*2   a*4");
         int a = 1;
         for(int i = 1;i < 4; i++,a *= 2){
             System.out.print(a + "   ");
         }
         System.out.println();
         System.out.println("....");
         a = 4;
         for(int i = 1; i < 4; i++, a*= 2){
             System.out.print(a + "   ");
         }
     }
}

