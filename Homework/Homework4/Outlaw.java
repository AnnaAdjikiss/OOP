package Homework.Homework4;

import java.util.List;
import java.util.Random;

public class Outlaw extends BaseHero {
    private static final String HERO_OUTLAW = "Outlaw #%d";

    /**
     * это разбойник
     */
    public Outlaw(List<BaseHero> side) {
        super(side);
        super.setName(String.format(HERO_OUTLAW, ++ Outlaw.number));
        super.setAttack(8);
        super.setDefence(3);
        super.setShoot(0);
        super.setShoot(this.initShoot);
        super.setDamage(new Random().nextInt(2, 4));
        super.setInitHealth(10);
        super.setHealth(this.initHealth);
        super.setSpeed(6);
        super.setDelivery(false);
        super.setMagic(false);
        
    }

    /**
     * Дополнительный конструктор, на случай, если пользователь будет вводить имя
     * @param name введенное имя
     */
    public Outlaw (String name) {
        this.name = name; 
    }

    // проверяет, нет ли кого впереди него, если да - атакует, если нет - делает шаг на 2 клетки
    @Override
    public void step(List<BaseHero> target, List<BaseHero> ours) {
               
        //if target.pos.y == this.pos.y+1  _> target.health = target.health - super.getDamage();
        //else this.pos.y = this.pos.y+2
    }
}
