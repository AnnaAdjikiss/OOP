package OOP.Homework.Homework1;
import java.util.Random;

public class Crossbowman {
    private static final String HERO_CROSSBOWMAN = "Hero_Crossbowman #%d";
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
     * это арбалетчик
     */
    public Crossbowman() {
        name = String.format(HERO_CROSSBOWMAN, ++ Crossbowman.number);
        attack = 6;
        defence = 3;
        shoot = 16;
        damage = new Random().nextInt(2, 3);
        health = 10;
        speed = 4;
        delivery = false;
        magic = false;
    }

    /**
     * Дополнительный конструктор, на случай, если пользователь будет вводить имя
     * @param name введенное имя
     */
    public Crossbowman (String name) {
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
