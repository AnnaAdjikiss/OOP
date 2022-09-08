package Homework.Homework3;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseHero implements Actions{
    
    protected static int number;
    
    protected String name;
    protected  int attack;                             
    protected  int defence;                            
    protected  int shoot;                              
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
    public Integer getShoot() {return shoot;}
    public Integer getDamage() {return damage;}
    public Integer getInitHealth() {return initHealth;}
    public Integer getSpeed() {return speed;}
    public Boolean getDelivery() {return delivery;}
    public Boolean getMagic() {return magic;}


     /**
     * сеттеры
     */
    public void setName(String name) {this.name = name;}
    public void setAttack(int attack) {this.attack = attack;}
    public void setDefence(int defence) {this.defence = defence;}
    public void setShoot(int shoot) {this.shoot = shoot;}
    public void setDamage(int damage) {this.damage = damage;}
    public void setInitHealth(int initHealth) {this.initHealth = initHealth;}
    public void setSpeed(int speed) {this.speed = speed;}
    public void setDelivery(Boolean delivery) {this.delivery = delivery;}
    public void setMagic(Boolean magic) {this.magic = magic;}

    @Override
    public void step(ArrayList<BaseHero> target, ArrayList<BaseHero> ours) {
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
