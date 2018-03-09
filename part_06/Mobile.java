package part_06;

public class Mobile extends Device {

    public Mobile(String identifier, String os, String model) {
        super(identifier, os, model);
    }

    @Override
    public void charge(int time){
        //Slow charging phone
        setBatteryLevel((time > 19 ) ? 100 : time*5);
        System.out.println(getIdentifier() + " has been charging for " + time + " hours" +
                ". Its battery level is " + getBatteryLevel()+"%.");
    }

    @Override
    public void helloWorld() {
        System.out.println("Hello world!, Im a Mobile!");
    }
}
