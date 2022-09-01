package OOP.Homework.Homework1;

public class Warlock {
    private static final String HEROWarlock = "HeroWarlock #%d";
    public static int number;
    
    private String name;
    private int attack;                             
    private int defence;                            
    private int shoot;                              
    private int dWarlocke;         
    private int health;
    private int speed;
    private boolean delivery;
    private boolean magic;

    /**
     * это колдун
     */
    public Warlock() {
        name = String.format(HEROWarlock, ++Warlock.number);
        attack = 17;
        defence = 12;
        shoot = 0;
        dWarlocke = -5;
        health = 30;
        speed = 9;
        delivery = false;
        magic = true;
    }

    /**
     * Дополнительный конструктор, на случай, если пользователь будет вводить имя
     * @param name введенное имя
     */
    public Warlock (String name) {
        this.name = name; 
    }

    /**
     * геттеры
     */
    public String getName() {return name;}
    public Integer getAttack() {return attack;}
    public Integer getShoot() {return shoot;}
    public Integer getDWarlocke() {return dWarlocke;}
    public Integer getHealth() {return health;}
    public Integer getSpeed() {return speed;}
    public Boolean getDelivery() {return delivery;}
    public Boolean geWarlockic() {return magic;}

    /**
     * @return метод возвращающий строку с  кратким описанием персонажа
     */
    public String getInfo() {
        return String.format("Name: %s  Attack: %d Defence: %d Shoot: %s DWarlocke: %s Health: %s Speed: %s Delivery: %sWarlockic: %s",
                name, attack, defence, shoot, dWarlocke, health, speed, delivery,magic);
    }
}
