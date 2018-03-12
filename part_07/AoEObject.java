package part_07;

import java.awt.*;

public class AoEObject implements AoEObjectInterface{

    private int hitpoints;
    private String name;
    private int meleeArmor;
    private int pierceArmor;
    private int lineOfSight;
    private Point position;
    private String owner;

    public AoEObject(int hitpoints, String name, int meleeArmor, int pierceArmor, int lineOfSight, Point position, String owner) {
        this.hitpoints = hitpoints;
        this.name = name;
        this.meleeArmor = meleeArmor;
        this.pierceArmor = pierceArmor;
        this.lineOfSight = lineOfSight;
        this.position = position;
        this.owner = owner;
    }

    @Override
    public void destroy() {
        System.out.println(this.name + " has been destroyed!!");
    }

    @Override
    public Object buildTrain(int time, Point coord, String word) {
        System.out.println(word + " " + this.name);
        try {
            while(time > 0){
                Thread.sleep(330);
                time--;
                System.out.print(" .");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void switchOwnership(String player) {
        this.owner = player;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMeleeArmor() {
        return meleeArmor;
    }

    public void setMeleeArmor(int meleeArmor) {
        this.meleeArmor = meleeArmor;
    }

    public int getPierceArmor() {
        return pierceArmor;
    }

    public void setPierceArmor(int pierceArmor) {
        this.pierceArmor = pierceArmor;
    }

    public int getLineOfSight() {
        return lineOfSight;
    }

    public void setLineOfSight(int lineOfSight) {
        this.lineOfSight = lineOfSight;
    }
}
