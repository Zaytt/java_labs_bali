package part_09;

public class SyncQueueController {
    public static void main(String[] args) {
        int array[] = new int[9];
        SyncQueue syncQueue = new SyncQueue(array);
        QueueThread queueThread = new QueueThread("Thread 1", syncQueue);
        QueueThread queueThread2 = new QueueThread("Thread 2", syncQueue);

        try {
            queueThread.thread.join();
            queueThread2.thread.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }

    }
}
