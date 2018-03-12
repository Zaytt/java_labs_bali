package part_07;

import java.awt.*;

public class EagleWarrior extends MeleeWarrior{

    public EagleWarrior(int hitpoints, String name, int meleeArmor, int pierceArmor, int lineOfSight, Point position,
                        String owner, int movementSpeed, int range, boolean isMoving, int attack) {
        super(hitpoints, name, meleeArmor, pierceArmor, lineOfSight, position, owner, movementSpeed, range, isMoving, attack);
    }

    public void Dash(){
        System.out.println(this.getName() + " movement speed increased by 30% for 5 seconds.");
        this.setMovementSpeed((int)(this.getMovementSpeed()*1.30));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() + " movement speed back to normal.");
    }
}
