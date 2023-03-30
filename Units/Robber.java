package Units;

import java.util.ArrayList;

public class Robber extends BaseHero {

    public Robber(ArrayList<BaseHero> name,int x, int y) {
        super(name, 8, 3, new int[] {2, 5}, 10, 6, x, y);
    }
}
