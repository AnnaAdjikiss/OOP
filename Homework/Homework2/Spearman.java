package Homework.Homework2;
import java.util.List;
import java.util.Random;

public class Spearman extends BaseHero {
    
    private static final String HERO_SPEARMAN = "Spearman #%d";

    /**
     * это копейщик
     */
    public Spearman(List<BaseHero> side, int x, int y) {
        super(side);
        super.setName(String.format(HERO_SPEARMAN, ++ Spearman.number));
        super.setAttack(4);
        super.setDefence(5);
        super.setShoot(0);
        super.setDamage(new Random().nextInt(1, 3));
        super.setHealth(10);
        super.setSpeed(4);
        super.setDelivery(false);
        super.setMagic(false);
        super.setPosition((float)(Math.sqrt(x*x +y*y)));  //расстояние от начала координат (пусть пока так будет)
        
    }

    /**
     * Дополнительный конструктор, на случай, если пользователь будет вводить имя
     * @param name введенное имя
     */
    public Spearman (String name) {
        this.name = name; 
    }
}

    

