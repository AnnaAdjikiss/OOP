package Homework.Homework3;

import java.util.List;

public class Peasant extends BaseHero{
    private static final String HERO_PEASANT = "Peasant #%d";

    /**
     * это крестьянин
     */
    public Peasant(List<BaseHero> side) {
        super(side);
        super.setName(String.format(HERO_PEASANT, ++ Peasant.number));
        super.setAttack(1);
        super.setDefence(1);
        super.setShoot(0);
        super.setDamage(1);
        super.setInitHealth(1);
        super.setSpeed(3);
        super.setDelivery(true);
        super.setMagic(false);
        
    }

    /**
     * Дополнительный конструктор, на случай, если пользователь будет вводить имя
     * @param name введенное имя
     */
    public Peasant (String name) {
        this.name = name; 
    }

}
