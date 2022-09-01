package OOP.Homework.Homework1;

import java.util.Random;

public class Sniper {
    private static final String HERO_SNIPER = "Hero_Sniper #%d";
    public static int number;
    
    private String name;
    private int attack;                             
    private int defence;                            
    private int shoot;                              
    private int damage;         
    private int health;
    private int speed;
    private boolean delivery;
    private boolean magic;

    /**
     * это снайпер
     */
    public Sniper() {
        name = String.format(HERO_SNIPER, ++ Sniper.number);
        attack = 12;
        defence = 10;
        shoot = 32;
        damage = new Random().nextInt(8, 10);
        health = 15;
        speed = 9;
        delivery = false;
        magic = false;
    }

    /**
     * Дополнительный конструктор, на случай, если пользователь будет вводить имя
     * @param name введенное имя
     */
    public Sniper (String name) {
        this.name = name; 
    }

    /**
     * геттеры
     */
    public String getName() {return name;}
    public Integer getAttack() {return attack;}
    public Integer getShoot() {return shoot;}
    public Integer getDamage() {return damage;}
    public Integer getHealth() {return health;}
    public Integer getSpeed() {return speed;}
    public Boolean getDelivery() {return delivery;}
    public Boolean getMagic() {return magic;}

    /**
     * @return метод возвращающий строку с  кратким описанием персонажа
     */
    public String getInfo() {
        return String.format("Name: %s  Attack: %d Defence: %d Shoot: %s Damage: %s Health: %s Speed: %s Delivery: %s Magic: %s",
                name, attack, defence, shoot, damage, health, speed, delivery, magic);
    }
}
