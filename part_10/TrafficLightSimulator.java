package part_10;

enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);
    int delay;
    TrafficLightColor(int delay) {
        this.delay = delay;
    }

    public int getDelay(){
        return delay;
    }
}

public class TrafficLightSimulator  implements Runnable{
    private Thread thread; // holds the thread that runs the simulation
    private TrafficLightColor tlc; // holds the traffic light color
    private boolean stop = false; // set to true to stop the simulation
    boolean changed = false; // true when the light has changed


    public TrafficLightSimulator(TrafficLightColor tlc) {
        this.tlc = tlc;
        thread = new Thread(this);
        thread.start();
    }

    public TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while(!stop){
            try {
                Thread.sleep(tlc.getDelay());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            changeColor();
        }
    }

    public synchronized void changeColor() {
        switch (tlc){
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
        }
        changed = true;
        notify(); //Signal that the light has changed
    }

    public synchronized void waitForChange(){
        try {
            while(!changed)
                wait(); //wait for light to change
            changed = false;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized TrafficLightColor getColor(){
        return tlc;
    }

    // Stop the traffic light.
    synchronized void cancel() {
        stop = true;
    }



}
