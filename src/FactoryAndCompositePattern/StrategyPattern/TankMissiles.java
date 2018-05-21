package FactoryAndCompositePattern.StrategyPattern;

import FactoryAndCompositePattern.CompositePattern.TankInterface;
import FactoryAndCompositePattern.Utility;

public abstract class TankMissiles implements AttackBehaviour{
    int damage;

    public TankMissiles(int damage){
        this.damage = damage;
    }

    @Override
    public void shoot(TankInterface tank, TankInterface target) {
        //1-direct hit, 2-hit not direct, 3-miss
        int hitType = (int)(Math.random()*3)+1;
        switch(hitType){
            case 1:
                Utility.printAndSleep( tank.getName() + " SHOOTS, DIRECT HIT for (" + damage + " damage)");
                target.takeDamage(this.damage);
                break;
            case 2:
                Utility.printAndSleep(tank.getName()  + " SHOOTS and hit for (" + damage/2 + " damage)");
                target.takeDamage(this.damage/2);
                break;
            case 3:
                Utility.printAndSleep(tank.getName()  + " SHOOTS... and missed...");
        }

    }

}
