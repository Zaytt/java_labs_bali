package part_11;

import part_08.EmptyStackException;

/**
 * Modify your Queue Class so that it is completely generic
 */
public class Exercise_03 {

    public static void main(String[] args) {
        String[] stringArray = new String[10];

        Queue genQueue = new Queue(stringArray);
        genQueue.put("Hello ");
        genQueue.put("World, ");
        genQueue.put("I'm ");
        genQueue.put("in ");
        genQueue.put("Bali");

        try{
            while(true){
                System.out.println(genQueue.nextElement());
            }

        } catch (EmptyQueueException e){
            System.out.println("Empty queue");
        }


    }

}

class Queue<T> {
    private T array[];
    private int putLoc = 0;
    private int getLoc = 0;
    public Queue(T[] array) {
        this.array = array;
    }

    //Will return the next item in the queue. When used and the queue is spent, it will return -1.
    public synchronized T nextElement(){
        try{
            T value = this.array[getLoc];
            getLoc++;
            return value;
        } catch (ArrayIndexOutOfBoundsException e){
            throw new EmptyQueueException();
        } finally {
            notify();
        }
    }

    public synchronized void put(T val){
        try{
            array[putLoc++] = val;

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Queue full;");
        }finally {
            notify();
        }

    }

    public synchronized int getPutLoc() {
        return putLoc;
    }

}

class EmptyQueueException extends RuntimeException{

    public EmptyQueueException() {
    }

}