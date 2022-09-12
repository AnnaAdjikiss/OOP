package Homework.Homework4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Peasant extends BaseHero{
    private static final String HERO_PEASANT = "Peasant #%d";

    /**
     * это крестьянин
     */
    public Peasant(List<BaseHero> side) {
        super(side);
        super.setName(String.format(HERO_PEASANT, ++ Peasant.number));
        super.setAttack(1);
        super.setDefence(1);
        super.setInitShoot(0);
        super.setShoot(this.initShoot);
        super.setDamage(1);
        super.setInitHealth(1);
        super.setHealth(this.initHealth);
        super.setSpeed(3);
        super.setDelivery(true);
        super.setMagic(false);
        
    }

    /**
     * Дополнительный конструктор, на случай, если пользователь будет вводить имя
     * @param name введенное имя
     */
    public Peasant (String name) {
        this.name = name; 
    }

    //проверяет среди своих стрелков, если у кого не хватает shoots - восполняет запас.
    //(если таких несколько - выбор делается случайным образом)
    @Override
    public void step(List<BaseHero> target, List<BaseHero> ours) {
        Random rand = new Random();  
        List<BaseHero> ourSideShooters = new ArrayList<BaseHero>();  
        for (int i = 0; i < ours.size(); i++) {
            if (ours.get(i).name.contains("Crossbowman") ) ourSideShooters.add(ours.get(i));
            if (ours.get(i).name.contains("Sniper") ) ourSideShooters.add(ours.get(i));
            }
                                 
        ours.get(rand.nextInt(ourSideShooters.size())).shoot = initShoot;
    
    }

}
