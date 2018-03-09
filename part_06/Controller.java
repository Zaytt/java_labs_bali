package part_06;

class Controller {

    public static void main(String[] args) {
        Laptop lap = new Laptop("IvanLaptop", "MacOS", "MacBook Pro", "American", "13", "Trackpad");
        Mobile mob = new Mobile("IvanPhone", "Android", "S5" );
        Computer pc = new Computer("Mi PC", "Windows XP", "HP", "Keyboard", "Mouse");
        Device dev = new Device("GenericOS", "Generic Device");

        System.out.println(lap.getIdentifier()+ " is a subclass of Computer.");
        System.out.println(mob.getIdentifier()+ " is a subclass of device.");
        System.out.println(dev.getIdentifier()+ " was instantiated with an overloaded constructor");


        lap.powerButton();
        mob.powerButton();

        lap.charge(5);
        mob.charge(5);

        System.out.println();

        System.out.println("Demonstrating dynamic method dispatch");
        System.out.println();
        System.out.println("Creating a Device reference called device");
        Device device;

        device = dev;
        System.out.println("device now refers to the GenericDevice");
        device.helloWorld();
        System.out.println();

        device = pc;
        System.out.println("device now refers to a Computer class");
        device.helloWorld();
        System.out.println();

        device = lap;
        System.out.println("device now refers to a Laptop class");
        device.helloWorld();



    }
}
