package part_06;

public class Device {

    private int batteryLevel;
    private String identifier;
    private boolean isOn;
    private String os;
    private String model;


    public Device(String identifier, String os, String model) {
        this.identifier = identifier;
        this.isOn = false;
        this.os = os;
        this.model = model;
        this.batteryLevel = 0;
    }

    public Device(String os, String model){
        this.identifier = " Generic Device";
        this.isOn = false;
        this.os = os;
        this.model = model;
        this.batteryLevel = 0;
    }

    public void charge(int time){
        batteryLevel = (time > 9 ) ? 100 : time*10;
        System.out.println(identifier + " has been charging for " + time + " hours " +
                                ". Its battery level is " + batteryLevel + "%." );
    }

    public void helloWorld(){
        System.out.println("Hello world!, Im just a device!");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public boolean isOn() {
        return isOn;
    }

    public void powerButton() {
        isOn = !isOn;
        System.out.println((isOn) ? this.identifier + " power on": this.identifier + " power on");
    }
}
