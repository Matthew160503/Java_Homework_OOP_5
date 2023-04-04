package Units;

import java.util.ArrayList;

public class Sniper extends Shooter{

    public Sniper(ArrayList<BaseHero> name,int x, int y) {
        super(name, 12, 10, new int[] {1, 3}, 15, 9, 32, x, y);
    }
}