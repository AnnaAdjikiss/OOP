package Homework.Homework2;

import java.util.List;

public class Monk extends BaseHero {   
    private static final String HERO_Monk = "Monk #%d";

    /**
     * это монах
     */
    public Monk(List<BaseHero> side, int x, int y) {
        super(side);
        super.setName(String.format(HERO_Monk, ++ Monk.number));
        super.setAttack(12);
        super.setDefence(7);
        super.setShoot(0);
        super.setDamage(-4);
        super.setHealth(30);
        super.setSpeed(5);
        super.setDelivery(false);
        super.setMagic(true);
        super.setPosition((float)(Math.sqrt(x*x +y*y)));  //расстояние от начала координат (пусть пока так будет)
        
    }

    /**
     * Дополнительный конструктор, на случай, если пользователь будет вводить имя
     * @param name введенное имя
     */
    public Monk (String name) {
        this.name = name; 
    }
}
