package Homework.Homework2;

import java.util.List;

public class Peasant extends BaseHero{
    private static final String HERO_PEASANT = "Peasant #%d";

    /**
     * это крестьянин
     */
    public Peasant(List<BaseHero> side, int x, int y) {
        super(side);
        super.setName(String.format(HERO_PEASANT, ++ Peasant.number));
        super.setAttack(1);
        super.setDefence(1);
        super.setShoot(0);
        super.setDamage(1);
        super.setHealth(1);
        super.setSpeed(3);
        super.setDelivery(true);
        super.setMagic(false);
        super.setPosition((float)(Math.sqrt(x*x +y*y)));  //расстояние от начала координат (пусть пока так будет)
        
    }

    /**
     * Дополнительный конструктор, на случай, если пользователь будет вводить имя
     * @param name введенное имя
     */
    public Peasant (String name) {
        this.name = name; 
    }

}
