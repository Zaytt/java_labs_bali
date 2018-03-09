package part_06;

public class Laptop extends Computer{

    String screen;

    public Laptop(String name, String os, String model, String keyboard, String screen, String mouse) {
        super(name, os, model, keyboard, mouse);
        this.screen = screen;
    }

    @Override
    public void charge(int time){
        //Fast charging laptop
        setBatteryLevel((time > 4 ) ? 100 : time*20);
        System.out.println(getIdentifier() + " has been charging for " + time + " hours." +
                                    " Its battery level is " + getBatteryLevel()+"%.");
    }

    @Override
    public void helloWorld() {
        System.out.println("Hello world!, Im a super cool laptop!");
    }
}
