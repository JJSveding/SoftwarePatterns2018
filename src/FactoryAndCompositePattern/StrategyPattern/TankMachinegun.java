package FactoryAndCompositePattern.StrategyPattern;

import FactoryAndCompositePattern.CompositePattern.TankInterface;
import FactoryAndCompositePattern.Utility;

public abstract class TankMachinegun implements AttackBehaviour{
    private int damage;
    private int amountOfShots;

    public TankMachinegun(int damage, int amountOfShots){
        this.damage = damage;
        this.amountOfShots = amountOfShots;
    }

    @Override
    public void shoot(TankInterface tank, TankInterface target) {
        //1-direct hit, 2-hit not direct, 3-miss

        int amountOfHits = 0;
        int totalDamage = 0;
        for (int i = 0;i<this.amountOfShots;i++)
        {
            int hitType = (int)(Math.random()*3)+1;

            if(hitType==1){
                amountOfHits++;
                totalDamage += this.damage;
            }
            else if(hitType==2)
            {
                amountOfHits++;
                totalDamage += this.damage/2;
            }
            else if (hitType==3)
            {
                //Nothing
            }

        }
        Utility.printAndSleep(tank.getName()+" machinegun attack: "+ amountOfHits+" hits "+totalDamage+" total damage");
        target.takeDamage(totalDamage);

    }

}
