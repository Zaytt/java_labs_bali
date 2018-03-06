package part_02;


/**
 * Part 2 Exercise 10:
 *
 *      Write a program that prints out every prime number between 1 and 100
 *
 */
public class Exercise_10 {

    public static void main(String[] args) {

        for(int i = 2; i < 100; i++){
            int divisors = 0;
            for(int j = 2; j <= i; j++){
                if(i % j == 0 ){
                    divisors++;
                }
                if(divisors > 1) break;
            }
            if(divisors == 1){
                System.out.print( i + " ");
            }
            divisors = 0;
        }
    }

}


