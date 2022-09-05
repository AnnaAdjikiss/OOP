package Homework.Homework2;

import java.util.List;

public class Warlock extends BaseHero {
    private static final String HEROWarlock = "Warlock #%d";
    
    /**
     * это колдун
     */
    public Warlock(List<BaseHero> side, int x, int y) {
        super(side);
        super.setName(String.format(HEROWarlock, ++ Warlock.number));
        super.setAttack(17);
        super.setDefence(12);
        super.setShoot(0);
        super.setDamage(-5);
        super.setHealth(30);
        super.setSpeed(9);
        super.setDelivery(false);
        super.setMagic(true);
        super.setPosition((float)(Math.sqrt(x*x +y*y)));  //расстояние от начала координат (пусть пока так будет)
    }

    /**
     * Дополнительный конструктор, на случай, если пользователь будет вводить имя
     * @param name введенное имя
     */
    public Warlock (String name) {
        this.name = name; 
    }
}
