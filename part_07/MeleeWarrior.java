package part_07;

import java.awt.*;

public class MeleeWarrior extends Unit{

    private int attack;


    public MeleeWarrior(int hitpoints, String name, int meleeArmor, int pierceArmor, int lineOfSight, Point position,
                        String owner, int movementSpeed, int range, boolean isMoving, int attack) {
        super(hitpoints, name, meleeArmor, pierceArmor, lineOfSight, position, owner, movementSpeed, range, isMoving);
        this.attack = attack;
    }

    public void attack(Unit target){
        System.out.println(this.getName() + " is attacking " +  target.getName());
    }
}
