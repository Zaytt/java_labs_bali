package part_11;

/**
Let's say you have an integer array and a string array. Write a single method printArray that can print all
the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

Complete the code so that it prints the following lines:

 1
 2
 3
 Hello
 World

**/

public class Exercise_01 <T> {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3};
        String[] stringArray = {"Hello", "World"};

        Exercise_01<Integer> ex1 = new Exercise_01<Integer>();
        Exercise_01<String> ex2 = new Exercise_01<String>();

        ex1.printArray(intArray);
        ex2.printArray(stringArray);
    }

    public void printArray(T[] array){
        for (T x: array)
            System.out.println(x);
    }
}






