package Homework.Homework3;
import java.util.List;
import java.util.Random;

public class Crossbowman extends BaseHero {
    private static final String HERO_CROSSBOWMAN = "Crossbowman #%d";
    
    /**
     * это арбалетчик
     */
    public Crossbowman(List<BaseHero> side) {
        super(side);
        super.setName(String.format(HERO_CROSSBOWMAN, ++ Crossbowman.number));
        super.setAttack(6);
        super.setDefence(3);
        super.setShoot(16);
        super.setDamage(new Random().nextInt(2, 3));
        super.setInitHealth(10);
        super.setSpeed(4);
        super.setDelivery(false);
        super.setMagic(false);
    }

    /**
     * Дополнительный конструктор, на случай, если пользователь будет вводить имя
     * @param name введенное имя
     */
    public Crossbowman (String name) {
        this.name = name; 
    }
}
