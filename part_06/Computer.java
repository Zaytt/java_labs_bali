package part_06;

public class Computer extends Device{
    String keyboard;
    String mouse;

    public Computer(String identifier, String os, String model, String keyboard, String mouse) {
        super(identifier, os, model);
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    @Override
    public void helloWorld() {
        System.out.println("Hello world!, Im just a computer!");
    }
}
