package part_11;

/**
 Write a generic method to exchange the positions of two different elements in an array.
 */

public class Exercise_02<T> {

    public static void main(String[] args) {

        String[] stringArray = {"Hello", "World" };
        Exercise_02 ex2 = new Exercise_02();
        ex2.swapPositions(stringArray, 0 ,1);

        for (String x: stringArray) System.out.println(x);

    }


    public void swapPositions(T[] array, int pos1, int pos2){
        if((pos1  >= array.length) || (pos2  >= array.length) || (pos1 < 0) || (pos2 < 0)){
            System.out.println("Index out of bounds");
            return;
        }
        T temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }



}

