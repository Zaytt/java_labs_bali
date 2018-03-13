package part_09;

public class SyncQueue{
    private int array[];
    private int putLoc = 0;
    private int getLoc = 0;
    public SyncQueue(int[] array) {
        this.array = array;
    }

    //Will return the next item in the queue. When used and the queue is spent, it will return -1.
    public synchronized int nextInt(){
        try{
            int value = this.array[getLoc];
            getLoc++;
            return value;
        } catch (ArrayIndexOutOfBoundsException e){
            return -1;
        } finally {
            notify();
        }
    }

    public synchronized void put(int val){
        try{
            array[putLoc++] = val;

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Queue full;");
        }finally {
            notify();
        }

    }

    public String printArray(){
        String queue = "{";

        for (int x: this.array)
            queue += x + ", ";
        queue += "}";

        return queue;
    }

    public synchronized int getPutLoc() {
        return putLoc;
    }
}
