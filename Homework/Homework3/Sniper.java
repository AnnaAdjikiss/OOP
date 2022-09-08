package Homework.Homework3;

import java.util.List;
import java.util.Random;

public class Sniper extends BaseHero {
    private static final String HERO_SNIPER = "Sniper #%d";

    /**
     * это снайпер
     */
    public Sniper(List<BaseHero> side) {
        super(side);
        super.setName(String.format(HERO_SNIPER, ++ Sniper.number));
        super.setAttack(12);
        super.setDefence(10);
        super.setShoot(32);
        super.setDamage(new Random().nextInt(8, 10));
        super.setInitHealth(15);
        super.setSpeed(9);
        super.setDelivery(false);
        super.setMagic(false);
        
    }

    /**
     * Дополнительный конструктор, на случай, если пользователь будет вводить имя
     * @param name введенное имя
     */
    public Sniper (String name) {
        this.name = name; 
    }
}
