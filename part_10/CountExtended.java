package part_10;

public class CountExtended extends Thread{
    int count;
    long timeMilis;

    public CountExtended(String name, int priority, int count) {
        this.count = count;
        this.setName(name);
        this.setPriority(priority);
        this.start();
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " beginning...");

        long startTime = System.currentTimeMillis();
        for(int i= 0 ; i < count ; i++){
            System.out.println(this.getName() + ": " + i);
        }
        long stopTime = System.currentTimeMillis();
        System.out.println(this.getName() + " terminating.");

        this.timeMilis = (stopTime-startTime);
    }

    public long getTimeMilis() {
        return timeMilis;
    }
}
