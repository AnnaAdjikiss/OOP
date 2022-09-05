package Homework.Homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        List<BaseHero> side = new ArrayList<BaseHero>();

        int teamCount = 10;
        Random rand = new Random();

        for (int i = 0; i < teamCount; i++) {
            switch (rand.nextInt(6)){
                case 0:
                    side.add(new Crossbowman(side, 0, 0));
                    break;
                case 1:
                    side.add(new Monk(side, 0,0));
                    break;

                case 2:
                    side.add(new Outlaw(side, 0,0));
                    break;

                case 3:
                    side.add(new Peasant(side, 0,0));
                    break;

                case 4:
                    side.add(new Sniper(side, 0,0));
                    break;

                case 5:
                    side.add(new Spearman(side, 0,0));
                    break;

                default:
                    side.add(new Warlock(side, 0,0));
            }
        }
        
        List<BaseHero> darkSide = new ArrayList<BaseHero>(side);
        List<BaseHero> lightSide = new ArrayList<BaseHero>(side);
        System.out.println("INITIAL HEROES INFO");
        showTeamsInfo(teamCount, darkSide, lightSide);

//Darkside атакует LightSide

        for (int j = 0; j < teamCount; j++) {
            darkSide.get(j).hit(lightSide.get(j));
        }
        System.out.println();
        System.out.println("AFTER ATTACK HEROES INFO");
        showTeamsInfo(teamCount, darkSide, lightSide);
    }
    
    public static void showTeamsInfo(int teamCount, List<BaseHero> darkSide, List<BaseHero> lightSide){
        System.out.println("--------------------------------------------");
        System.out.println("Dark side\t\t\t\t\t\tLight side");
        for (int i = 0; i < teamCount; i++) {
            if (darkSide.get(i).getShortInfo().length() > 40) {
                System.out.println(darkSide.get(i).getShortInfo() + "\t:\t" + lightSide.get(i).getShortInfo());
            } else {
                System.out.println(darkSide.get(i).getShortInfo() + "\t\t:\t" + lightSide.get(i).getShortInfo());
            }
        }
    }
}
