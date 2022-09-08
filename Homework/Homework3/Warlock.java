package Homework.Homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Warlock extends BaseHero {
    private static final String HEROWarlock = "Warlock #%d";
    
    /**
     * это колдун
     */
    public Warlock(List<BaseHero> side) {
        super(side);
        super.setName(String.format(HEROWarlock, ++ Warlock.number));
        super.setAttack(17);
        super.setDefence(12);
        super.setShoot(0);
        super.setDamage(5);
        super.setInitHealth(30);
        super.setSpeed(9);
        super.setDelivery(false);
        super.setMagic(true);
    
    }

    @Override
    public void step(ArrayList<BaseHero> target, ArrayList<BaseHero> ours) {
        Random rand = new Random();  
        List<BaseHero> ourSideHurt = new ArrayList<BaseHero>();  //находим раненых наших
        for (int i = 0; i < ours.size(); i++) {
            if (ours.get(i).health <= ours.get(i).initHealth) ourSideHurt.add(ours.get(i));
            }
        //случайным образом выбираем одного из них и лечим                            
        ours.get(rand.nextInt(ourSideHurt.size())).health = initHealth;

        if (ourSideHurt.size() == 0) {   //если у нас раненых нет - атакуем противника
            BaseHero victim = target.get(rand.nextInt(target.size()));
            victim.health = victim.health - super.getDamage();
        }    
    }
}

