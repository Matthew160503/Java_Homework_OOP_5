package Units;

import java.util.ArrayList;

public class Magician extends BaseHero {

    private int mana;
    private int maxMana;

    public Magician(ArrayList<BaseHero> name,int x, int y) {
        super(name, 17, 12, new int[] {2, 5}, 30, 9, x, y);
        this.maxMana = 1;
        this.mana = maxMana;
    }

    public int getMana(){
        return mana;
    }   
}
