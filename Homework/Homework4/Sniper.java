package Homework.Homework4;

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
        super.setInitShoot(32);
        super.setShoot(this.initShoot);
        super.setDamage(new Random().nextInt(8, 10));
        super.setInitHealth(15);
        super.setHealth(this.initHealth);
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
