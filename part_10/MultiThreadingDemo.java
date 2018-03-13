package part_10;

import part_09.SyncQueue;

public class MultiThreadingDemo {

    public static void main(String[] args) {
        /*CountExtended ce = new CountExtended();
        ce.setName("Extends Thread        ");
        CountRunnable cr = new CountRunnable("Implements Runnable   ");
        Thread myThread = new Thread(cr);

        ce.start();
        myThread.start();
        try {
            ce.join();
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        met1();

    }


    public static void met1(){
        int array[] = new int[1000];
        int i = 0;
        for (int x: array) array[i] = i++;

        SyncQueue syncQueue = new SyncQueue(array);

        NewQueueThread nq1 = new NewQueueThread("High Priority Thread", syncQueue, Thread.MAX_PRIORITY);
        NewQueueThread nq2 = new NewQueueThread("Low Priority Thread", syncQueue, Thread.MIN_PRIORITY);

    }
}
