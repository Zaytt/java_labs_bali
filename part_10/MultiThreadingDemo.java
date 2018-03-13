package part_10;

import part_09.SyncQueue;

public class MultiThreadingDemo {

    public static void main(String[] args) {

        try {
            int count = 1000000;
            CountExtended ce = new CountExtended("High Priority", Thread.MAX_PRIORITY, count);
            CountRunnable cr = new CountRunnable("Low Priority", Thread.MIN_PRIORITY, count);
            ce.join();
            cr.thread.join();

            System.out.println(ce.getName() + " took " + ce.getTimeMilis() + "ms to count to " + count);
            System.out.println(cr.thread.getName() + " took " + ce.getTimeMilis()+ "ms to count to " + count);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }


}
