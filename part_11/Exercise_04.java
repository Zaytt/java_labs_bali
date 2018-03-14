package part_11;

/**
 make a new generic method called sumArray that will return the
 sum of all numbers in the array (no matter data type of numbers
 the array has in it)
 */


public class Exercise_04<T extends Number> {

    public static void main(String[] args) {

        Exercise_04 ex4 = new Exercise_04();
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.0};
        System.out.println("Integer array sum " + ex4.sumArray(intArray));
        System.out.println("Double array sum " + ex4.sumArray(doubleArray));

    }

    public double sumArray(T[] array){
        double sum = 0;
        for (T x: array) {
            sum += x.doubleValue();
        }
        return sum;
    }
}


