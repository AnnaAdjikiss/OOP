package Homework.Homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<BaseHero> side = new ArrayList<BaseHero>();

        int teamCount = 9;
        Random rand = new Random();

        for (int i = 0; i < teamCount; i++) {
            switch (rand.nextInt(6)){
                case 0:
                    side.add(new Crossbowman(side));
                    break;
                case 1:
                    side.add(new Monk(side));
                    break;

                case 2:
                    side.add(new Outlaw(side));
                    break;

                case 3:
                    side.add(new Peasant(side));
                    break;

                case 4:
                    side.add(new Sniper(side));
                    break;

                case 5:
                    side.add(new Warlock(side));
                    break;

                default:
                    side.add(new Spearman(side));
            }
        }
        
        ArrayList<BaseHero> darkSide = new ArrayList<BaseHero>(side);
        ArrayList<BaseHero> lightSide = new ArrayList<BaseHero>(side);
        
//расстановка по позициям

        for (int i = 0; i < teamCount; i++) {
            darkSide.get(i).pos = new Coordinates(i+1, 1);
            //lightSide.get(i).pos = new Coordinates(i+1, 9);
        }

 
        System.out.println("INITIAL HEROES INFO");
        showTeamsInfo(teamCount, darkSide, lightSide);
        System.out.println("--------------------------------------------");
        System.out.println("Enter 'n' for next step;  Enter 'q' for exit");

        int step = 1;
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                String input = in.nextLine();

                if (input.equals("n")) {
                    System.out.println("Step: " + Integer.toString(step++));
                    System.out.println("--------------------------------------------");
    
                    for (int j = 0; j < teamCount; j++) {
                        
                        darkSide.get(j).step(lightSide, darkSide);     //darkside acts
                        lightSide.get(j).step(darkSide, lightSide);     //lightside acts
                        }



                    System.out.println("AFTER ATTACK HEROES INFO");
                    showTeamsInfo(teamCount, darkSide, lightSide);
                
                }
                if (input.equals("q")) break;
            }
        }
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
        /* 
        System.out.println("--------------------------------------------");
        System.out.println("Dark side");
        for (int i = 0; i < teamCount; i++) {
            System.out.println(darkSide.get(i).getShortInfo());
        }
        System.out.println("--------------------------------------------");
        System.out.println("Light side");
        for (int i = 0; i < teamCount; i++) {
            System.out.println(lightSide.get(i).getShortInfo());
        }
        */
    }
}
