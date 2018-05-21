package FactoryAndCompositePattern.CompositePattern.ConcreteTanks;

import FactoryAndCompositePattern.StrategyPattern.AttackBehaviour;
import FactoryAndCompositePattern.CompositePattern.Tank;

public class HeavyTank extends Tank {

    public HeavyTank(int health, int damage, String name, int speed, AttackBehaviour machinegun, AttackBehaviour missiles){
        super(health, damage,name,speed, machinegun, missiles);
    }



}
