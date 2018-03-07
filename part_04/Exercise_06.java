package part_04;

/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */

public class Exercise_06{
    public static void main(String[] args) {
        int[] array = new int[101];
        Queue queue = new Queue(array);

        for(int i = 0; i <= 101; i++) queue.put(i);
        int value = 0;
        while(true){
            value = queue.nextInt();
            if(value != -1){
                System.out.println(value);
                continue;
            } else break;


        }

    }
}

class Queue{
    private int array[];
    private int putLoc = 0;
    private int getLoc = 0;
    public Queue(int[] array) {
        this.array = array;
    }

    //Will return the next item in the queue. When used and the queue is spent, it will return -1.
    public int nextInt(){
        try{
            int value = this.array[getLoc];
            getLoc++;
            return value;
        } catch (ArrayIndexOutOfBoundsException e){
            return -1;
        }
    }

    public void put(int val){
        try{
            array[putLoc++] = val;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Queue full;");
        }
    }

    public int getPutLoc() {
        return putLoc;
    }
}