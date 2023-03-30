package Units;

import java.util.ArrayList;

public class Monk extends BaseHero {

    private int elixir;
    private int maxElixir;

    public Monk(ArrayList<BaseHero> name,int x, int y) {
        super(name, 12, 7, new int[] {1,4}, 30, 5, x, y);
        this.maxElixir = 1;
        this.elixir = maxElixir;
    }

    public int getElixir(){
        return elixir;
    }
}
