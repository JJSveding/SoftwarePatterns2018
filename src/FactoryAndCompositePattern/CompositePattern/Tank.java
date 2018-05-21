package FactoryAndCompositePattern.CompositePattern;

import FactoryAndCompositePattern.CompositePattern.TankInterface;
import FactoryAndCompositePattern.ObserverPattern.Observer;
import FactoryAndCompositePattern.ObserverPattern.Subject;
import FactoryAndCompositePattern.StrategyPattern.AttackBehaviour;
import FactoryAndCompositePattern.Utility;

import java.util.ArrayList;
import java.util.List;

public abstract class Tank implements Subject, TankInterface {
    private List<Observer> army = new ArrayList<>();
    private int health;
    private int damage;
    private int speed;
    private String name;
    private Boolean alive;
    private AttackBehaviour activeWeapon; //Active
    private AttackBehaviour machinegun;
    private AttackBehaviour missiles;


    public Tank(int health, int damage, String name, int speed, AttackBehaviour machinegun, AttackBehaviour missiles)
    {
        this.health = health;
        this.damage = damage;
        this.speed = speed;
        this.name = name;
        this.machinegun = machinegun;
        this.missiles = missiles;
        this.activeWeapon = missiles; //Default attack behaviour.
    }

    //Composite shoot
    @Override
    public void shoot(TankInterface target) {
        activeWeapon.shoot(this, target);
    }

    //Composite drive
    @Override
    public void drive(int distance) {
        Utility.printAndSleep(this.name + " drives " + distance + " with the speed " + speed + "km/h");
    }

    //Composite take damage
    @Override
    public void takeDamage(int damage){
        this.health = this.health - damage;
        if(health <= 0){
            Utility.printAndSleep(this.getName() + " EXPLODED");
            alive = false;
            notifyObservers();
        }else{
            Utility.printAndSleep(this.getName() +" was hit (" + health +" health)");
        }

    }
    //Composite
    @Override
    public Boolean isAlive(){
        return alive;
    }

    @Override
    public void switchWeapon(){
        //Ternary operator
        activeWeapon = (activeWeapon == missiles) ? machinegun : missiles;
    }

    //Subject attach
    @Override
    public void attach(Observer o){
        army.add(o);
    }

    //Subject detach
    @Override
    public void detach(Observer o){
        army.remove(o);
    }

    //Subject notify observers
    @Override
    public void notifyObservers(){
        army.forEach((o) -> {
            o.update(this);
        });
    }


    //Composite
    @Override
    public String getName() {
        return name;
    }

}
