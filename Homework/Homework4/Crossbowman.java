package Homework.Homework4;
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
        super.setInitShoot(16);
        super.setShoot(this.initShoot);
        super.setDamage(new Random().nextInt(2, 3));
        super.setInitHealth(10);
        super.setHealth(this.initHealth);
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
    @Override  //проверяет, есть ли shoots и атакует противника, выбранного случайно.
    public void step(List<BaseHero> target, List<BaseHero> ours) {
        Random rand = new Random();  
       
        if (this.shoot >= 0) {
            BaseHero victim = target.get(rand.nextInt(target.size()));
            victim.health = victim.health - super.getDamage();
            this.shoot = this.shoot - 1;
        }      
    }
}
