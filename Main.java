import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import Units.*;

public class Main{

    public static final int GANG_SIZE = 10;

    public static ArrayList<BaseHero> whiteSide;

    public static ArrayList<BaseHero> darkSide;

    public static ArrayList<BaseHero> fullStack;
    public static void main(String[] args) {
        init();
        ConsoleView.view();
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            makeStep();
            ConsoleView.view();
            sc.nextLine();
        }
    }

    private static void init(){
        whiteSide = new ArrayList<>();
        darkSide = new ArrayList<>();
        fullStack = new ArrayList<>();

        int x = 1;
        int y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            switch(new Random().nextInt(4)){
                case 0: whiteSide.add(new Peasant(whiteSide, x, y++))
                ; break;
                case 1: whiteSide.add(new Crossbowman(whiteSide, x, y++)); break;
                case 2: whiteSide.add(new Monk(whiteSide, x, y++)); break;
                default: whiteSide.add(new Spearman(whiteSide, x, y++)); break;
            }
        }

        x = GANG_SIZE;
        y = 1;

        for (int i = 0; i < GANG_SIZE; i++) {
            switch(new Random().nextInt(4)){
                case 0: darkSide.add(new Peasant(darkSide, x, y++)); break;
                case 1: darkSide.add(new Sniper(darkSide, x, y++)); break;
                case 2: darkSide.add(new Magician(darkSide, x, y++)); break;
                default: darkSide.add(new Robber(darkSide, x, y++)); break;
            }
        }

        fullStack.addAll(whiteSide);
        fullStack.addAll(darkSide);
    }
    
    private static void makeStep(){
        fullStack.sort(new Comparator<BaseHero>(){
            @Override
            public int compare(BaseHero h1, BaseHero h2){
                if (h1.getSpeed() == h2.getSpeed()) return 0;
                else if (h1.getSpeed() > h2.getSpeed()) return 1;
                else return -1;
            }
        });

        for(BaseHero hero : fullStack){
            if(whiteSide.contains(hero)) hero.step(darkSide, whiteSide);
            else hero.step(whiteSide, darkSide);
        }
    }
}