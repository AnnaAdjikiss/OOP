package Homework.Homework4;

import java.util.List;

public abstract class BaseHero implements Actions{
    
    protected static int number;
    
    protected String name;
    protected  int attack;                             
    protected  int defence;                            
    protected  int shoot;    
    protected  int initShoot;                          
    protected  int damage;         
    protected  int initHealth;
    protected int health;
    protected int speed;
    protected  boolean delivery;
    protected boolean magic;
    
    protected String status;
    protected Coordinates pos;

    protected List<BaseHero> getList() {return list;}
    protected List<BaseHero> list;
    public BaseHero(List<BaseHero> side){list = side;}

    static {
        BaseHero.number = 0;
    }
    
    public BaseHero() {}

     /**
     * геттеры
     */
    public String getName() {return name;}
    public Integer getAttack() {return attack;}
    public Integer getDefence() {return defence;}
    public Integer getInitShoot() {return initShoot;}
    public Integer getShoot() {return shoot;}
    public Integer getDamage() {return damage;}
    public Integer getInitHealth() {return initHealth;}
    public Integer getHealth() {return health;}
    public Integer getSpeed() {return speed;}
    public Boolean getDelivery() {return delivery;}
    public Boolean getMagic() {return magic;}


     /**
     * сеттеры
     */
    public void setName(String name) {this.name = name;}
    public void setAttack(int attack) {this.attack = attack;}
    public void setDefence(int defence) {this.defence = defence;}
    public void setInitShoot(int initShoot) {this.initShoot = initShoot;}
    public void setShoot(int shoot) {this.shoot = shoot;}
    public void setDamage(int damage) {this.damage = damage;}
    public void setInitHealth(int initHealth) {this.initHealth = initHealth;}
    public void setHealth(int health) {this.health = health;}
    public void setSpeed(int speed) {this.speed = speed;}
    public void setDelivery(Boolean delivery) {this.delivery = delivery;}
    public void setMagic(Boolean magic) {this.magic = magic;}

    public Coordinates getDistance(List<BaseHero> side){
        /* 
        int dist = Integer.MAX_VALUE;
        int out = 0;
        for (int i = 0; i < side.size(); i++) {
            float dX = Math.abs(side.get(i).pos.x - pos.x);
            float dY = Math.abs(side.get(i).pos.y - pos.y);
            long tD = Math.round(Math.sqrt(dX*dX + dY*dY));
            if (dist > tD) {
                out = i;
                dist = (int) tD;
            }*/
            return pos;
        }
    
    @Override
    public Coordinates getPosition() {
        return pos;
    }

    @Override
    public String returnCondition() {
        return name +
                " H:" + health +
                " D:" + defence +
                " A:" + attack +
                " Dmg:" + damage + 
                " S:" + shoot ;
        /* 
                " H:" + crntHeals +
                " D:" + defence +
                " A:" + attack +
                " Dmg:" + (int) (Math.abs((damage.x + damage.y) / 2)) +
                (shoot > 0 ? " Shots:" + shoot : "") + " " +
                status;
                */
    }

    @Override
    public void step(List<BaseHero> target, List<BaseHero> ours) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public String getShortInfo() {
        return String.format(": %s : %s A: %d S: %s D: %s H: %s ",
            pos, name, attack, shoot, damage, health);
    }

    public String getInfo() {
        return String.format("Name: %s  Attack: %d Defence: %d Shoot: %s Damage: %s Health: %s Speed: %s Delivery: %s Magic: %s",
            name, attack, defence, shoot, damage, health, speed, delivery, magic);
    }

}
