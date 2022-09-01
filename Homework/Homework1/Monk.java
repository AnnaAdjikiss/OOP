package OOP.Homework.Homework1;

public class Monk {   
    private static final String HERO_Monk = "Hero_Monk #%d";
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
     * это монах
     */
    public Monk() {
        name = String.format(HERO_Monk, ++ Monk.number);
        attack = 12;
        defence = 7;
        shoot = 0;
        damage = -4;
        health = 30;
        speed = 5;
        delivery = false;
        magic = true;
    }

    /**
     * Дополнительный конструктор, на случай, если пользователь будет вводить имя
     * @param name введенное имя
     */
    public Monk (String name) {
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
