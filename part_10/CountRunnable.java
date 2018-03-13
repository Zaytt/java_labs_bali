package part_10;

public class CountRunnable implements Runnable{
    Thread thread;
    int count;
    long timeMilis;

    public CountRunnable(String threadName, int priority, int count) {
        this.count = count;
        this.thread = new Thread(this, threadName);
        this.thread.setPriority(priority);
        this.thread.start();

    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " beginning...");
        long startTime = System.currentTimeMillis();
        for(int i= 0 ; i < count ; i++){
            System.out.println(thread.getName() + ": " + i);
        }
        long stopTime = System.currentTimeMillis();
        System.out.println(thread.getName() + " terminating.");

        this.timeMilis = stopTime-startTime;
    }

    public long getTimeMilis() {
        return timeMilis;
    }
}
