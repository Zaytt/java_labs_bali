package part_07;

import java.awt.*;

public class Unit extends AoEObject{

    private int movementSpeed;
    private int range;
    private boolean isMoving;

    public Unit(int hitpoints, String name, int meleeArmor, int pierceArmor, int lineOfSight, Point position,
                String owner, int movementSpeed, int range, boolean isMoving) {
        super(hitpoints, name, meleeArmor, pierceArmor, lineOfSight, position, owner);
        this.movementSpeed = movementSpeed;
        this.range = range;
        this.isMoving = isMoving;
    }

    public void move(Point coord){

        double distance = this.getPosition().distance(coord);

        System.out.println(this.getName() + " is moving to " + coord.x + "," + coord.y + " ");
        try{
            while(distance > 0){
                Thread.sleep(200);
                System.out.print(".");
                distance -= this.movementSpeed;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void attack(Unit target){

    }

    @Override
    public void destroy() {
        System.out.println(this.getName() + " has been killed!!");
    }


    public Object buildTrain(int time, Point coord) {
        return super.buildTrain(time, coord, "Training");
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }


    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
