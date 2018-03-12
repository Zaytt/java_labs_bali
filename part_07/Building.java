package part_07;

import java.awt.*;

public class Building extends AoEObject{

    public Building(int hitpoints, String name, int meleeArmor, int pierceArmor, int lineOfSight, Point position, String owner) {
        super(hitpoints, name, meleeArmor, pierceArmor, lineOfSight, position, owner);
    }


    public Object buildTrain(int time, Point coord) {
        return super.buildTrain(time, coord, "Building");
    }
}
