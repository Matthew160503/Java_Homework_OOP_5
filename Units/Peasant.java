package Units;

import java.util.ArrayList;

public class Peasant extends BaseHero{

    protected int delivery;

    public Peasant(ArrayList<BaseHero> name,int x, int y) {
        super(name, 1, 1, new int[] {0,1}, 1, 3, x, y);
        this.delivery = 1;
    }

    @Override
    public String toString() {
        return "Peasant";
    }

    public int getDelivery(){
        return this.delivery;
    }

    public void checkDelivery(){
        this.delivery--;
    }
}

