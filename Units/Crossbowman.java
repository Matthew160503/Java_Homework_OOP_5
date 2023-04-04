package Units;

import java.util.ArrayList;

public class Crossbowman extends Shooter {

    public Crossbowman(ArrayList<BaseHero> name,int x, int y) {
        super(name, 6, 3, new int[] {1, 2}, 10, 4, 16, x, y);
    }
}
