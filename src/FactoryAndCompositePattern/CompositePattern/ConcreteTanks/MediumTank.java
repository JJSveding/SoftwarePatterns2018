package FactoryAndCompositePattern.CompositePattern.ConcreteTanks;

import FactoryAndCompositePattern.StrategyPattern.AttackBehaviour;
import FactoryAndCompositePattern.CompositePattern.Tank;

public class MediumTank extends Tank {


    public MediumTank(int health, int damage, String name, int speed, AttackBehaviour machinegun, AttackBehaviour missiles){
        super(health, damage, name, speed, machinegun, missiles);
    }

}
