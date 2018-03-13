package part_09;

public class QueueThread implements Runnable{
    Thread thread;
    SyncQueue sQueue;


    public QueueThread(String name, SyncQueue sQueue) {
        thread = new Thread(this, name);
        this.sQueue = sQueue;
        thread.start();
    }

    @Override
    public void run() {
        if (thread.getName().compareTo("Thread 1") == 0)
            for(int i = 0; i < 10 ; i += 2){
                System.out.println(thread.getName() + " puts " + i);
                sQueue.put(i);
            } else if (thread.getName().compareTo("Thread 2") == 0){
                for(int i = 1; i < 10 ; i += 2){
                    System.out.println(thread.getName() + " puts " + i);
                    sQueue.put(i);
                }
        }

        try {

            Thread.sleep(500);

            if(thread.getName().compareTo("Thread 1") == 0){
                System.out.println();
                System.out.print("Elements in Queue: " + this.sQueue.printArray());
                System.out.println();
            }


            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i = 0; i < 5 ; i ++){
            System.out.println(thread.getName() + " pops " + sQueue.nextInt());
            ;
        }


    }
}
