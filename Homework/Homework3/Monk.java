package Homework.Homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Monk extends BaseHero {   
    private static final String HERO_Monk = "Monk #%d";

    /**
     * это монах
     */
    public Monk(List<BaseHero> side) {
        super(side);
        super.setName(String.format(HERO_Monk, ++ Monk.number));
        super.setAttack(12);
        super.setDefence(7);
        super.setShoot(0);
        super.setDamage(-4);
        super.setInitHealth(30);
        super.setSpeed(5);
        super.setDelivery(false);
        super.setMagic(true);
        
    }

    /**
     * Дополнительный конструктор, на случай, если пользователь будет вводить имя
     * @param name введенное имя
     */
    public Monk (String name) {
        this.name = name; 
    }
    
    @Override
    public void step(ArrayList<BaseHero> target, ArrayList<BaseHero> ours) {
        Random rand = new Random();  
        List<BaseHero> ourSideHurt = new ArrayList<BaseHero>();  //находим раненых наших
        for (int i = 0; i < ours.size(); i++) {
            if (ours.get(i).health <= ours.get(i).initHealth) ourSideHurt.add(ours.get(i));
            }
        //случайным образом выбираем одного из них и лечим                            
        ours.get(rand.nextInt(ourSideHurt.size())).health = health + super.getDamage();
   
    }
}
