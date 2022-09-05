package Homework.Homework2;

import java.util.List;
import java.util.Random;

public class Outlaw extends BaseHero {
    private static final String HERO_OUTLAW = "Outlaw #%d";

    /**
     * это разбойник
     */
    public Outlaw(List<BaseHero> side, int x, int y) {
        super(side);
        super.setName(String.format(HERO_OUTLAW, ++ Outlaw.number));
        super.setAttack(8);
        super.setDefence(3);
        super.setShoot(0);
        super.setDamage(new Random().nextInt(2, 4));
        super.setHealth(10);
        super.setSpeed(6);
        super.setDelivery(false);
        super.setMagic(false);
        super.setPosition((float)(Math.sqrt(x*x +y*y)));  //расстояние от начала координат (пусть пока так будет)
        
    }

    /**
     * Дополнительный конструктор, на случай, если пользователь будет вводить имя
     * @param name введенное имя
     */
    public Outlaw (String name) {
        this.name = name; 
    }
}
