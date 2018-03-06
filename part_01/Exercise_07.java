package part_01;

/**
 * Part 1 Exercise 7:
 *      Print pi to the console using the following formula: note that this is not the complete series to
 *      compute the true number pi.
 *
 *      4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 *
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        double factor = 1;
        boolean sign = false;

        for(int i = 0, x = 3; i < 1000000; i++, x+=2){
            if(sign){
                factor += (1.0 / x);
            } else {
                factor -= (1.0 / x);
            }
            sign = !sign;
        }
        double pi = 4*factor;
        System.out.println("The value of PI is");
        System.out.println(pi);
    }

}