package OOP.Homework.Homework1;

public class Peasant {
    private static final String HERO_PEASANT = "Hero_Peasant #%d";
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
     * это крестьянин
     */
    public Peasant() {
        name = String.format(HERO_PEASANT, ++ Peasant.number);
        attack = 1;
        defence = 1;
        shoot = 0;
        damage = 1;
        health = 1;
        speed = 3;
        delivery = true;
        magic = false;
    }

    /**
     * Дополнительный конструктор, на случай, если пользователь будет вводить имя
     * @param name введенное имя
     */
    public Peasant (String name) {
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
