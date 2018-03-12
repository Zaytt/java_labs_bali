package part_07;

import java.awt.*;

public interface AoEObjectInterface <E>{

    void destroy();
    E buildTrain(int time, Point coord, String word);
    void switchOwnership(String player);
}
