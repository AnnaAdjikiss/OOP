package Homework.Homework4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program {
    private static final int[] l = {0};
    private static final int heroesCount = 10; 
    private static final List<BaseHero> lightSide = createTeam(heroesCount);
    private static final List<BaseHero> darkSide = createTeam(heroesCount);
    private static final String top10 = formatDiv("a") + String.join("", Collections.nCopies(9, formatDiv("-b"))) + formatDiv("-c");
    private static final String midl10 = formatDiv("d") + String.join("", Collections.nCopies(9, formatDiv("-e"))) + formatDiv("-f");
    private static final String bottom10 = formatDiv("g") + String.join("", Collections.nCopies(9, formatDiv("-h"))) + formatDiv("-i");
    public static void main(String[] args) {
            
    //расстановка по позициям
        for (int i = 0; i < heroesCount; i++) {
            darkSide.get(i).pos = new Coordinates(i + 1, 1);
            lightSide.get(i).pos = new Coordinates(i + 1, 10);
        }

        int step = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        in.nextLine();

        while (true) {
            if (step == 1 ){
                System.out.print(AnsiColors.ANSI_RED + "First step" + AnsiColors.ANSI_RESET);
            } else {
                System.out.print(AnsiColors.ANSI_RED + "Step:" + step + AnsiColors.ANSI_RESET);
            }
            step++;

            view();

            for (int j = 0; j < heroesCount; j++) {
                darkSide.get(j).step(lightSide, darkSide); // darkside acts
                lightSide.get(j).step(darkSide, lightSide); // lightside acts
            }
            /* *
            darkSide.forEach(BaseHero::step);
            lightSide.forEach(BaseHero::step);
            */
            in.nextLine();
            //if (in.equals("q")) break;   //шо-то не работает :(
        }
    }

    //в этом методе создается команда
    public static ArrayList<BaseHero> createTeam (int teamCount) {
    ArrayList<BaseHero> side = new ArrayList<BaseHero>();
    Random rand = new Random();
    for (int i = 0; i < teamCount; i++) {
        switch (rand.nextInt(6)) {
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
                side.add(new Knight(side));
        }
    }
    return side;
    }

    //в этом методе уголки и проч эл-ты поля
    private static String formatDiv(String str) {
        return str.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500');
    }

    //вывод на экран состояний героев
    private static void view() {
        darkSide.forEach((v) -> l[0] = Math.max(l[0], v.returnCondition().length()));
        for (int i = 0; i < l[0]*2; i++) System.out.print("_");
        System.out.println("");
        System.out.print(top10 + "    ");
        System.out.print("Blue side");
        for (int i = 0; i < l[0]-9; i++) System.out.print(" ");
        System.out.println(":\tGreen side");
        for (int i = 1; i < 11; i++) {
            System.out.print(getChar(1, i));
        }
        System.out.print("|    ");
        System.out.print(darkSide.get(0).returnCondition());
        tabSetter(darkSide.get(0).returnCondition().length(), l[0]);
        System.out.println(lightSide.get(0).returnCondition());
        System.out.println(midl10);

        for (int i = 2; i < 9; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(getChar(i, j));
            }
            System.out.print("|    ");
            System.out.print(darkSide.get(i-1).returnCondition());
            //System.out.print(darkSide.get(i-1).getDistance(lightSide).x+" "+darkSide.get(i-1).getDistance(lightSide).y);
            tabSetter(darkSide.get(i-1).returnCondition().length(), l[0]);
            System.out.println(lightSide.get(i-1).returnCondition());
            System.out.println(midl10);
        }
        for (int j = 1; j < 11; j++) {
            System.out.print(getChar(10, j));
        }
        System.out.print("|    ");
        System.out.print(darkSide.get(9).returnCondition());
        tabSetter(darkSide.get(9).returnCondition().length(), l[0]);
        System.out.println(lightSide.get(9).returnCondition());
        System.out.println(bottom10);
    }

    //тут герои вносятся в таблицу графически
    private static String getChar(int x, int y){
        String out = "| ";
        for (int cnt = 0; cnt < darkSide.size(); cnt++) {
            if (darkSide.get(cnt).getPosition().x == x && darkSide.get(cnt).getPosition().y == y) {
                out = "|" + (AnsiColors.ANSI_BLUE + darkSide.get(cnt).getName().charAt(0) + AnsiColors.ANSI_RESET);
            } else if (lightSide.get(cnt).getPosition().x == x && lightSide.get(cnt).getPosition().y == y) {
                out = "|" + (AnsiColors.ANSI_GREEN + lightSide.get(cnt).getName().charAt(0) + AnsiColors.ANSI_RESET);
            }
        }
        return out;
    }

    //что-то не очень понятное
    private static void tabSetter(int cnt, int max){
        int dif = max - cnt + 2;
        if (dif>0) System.out.printf("%"+ dif +"s", ":\t"); else System.out.print(":\t");
    }

}
