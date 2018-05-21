package FactoryAndCompositePattern.CompositePattern.ConcreteTanks;

import FactoryAndCompositePattern.StrategyPattern.AttackBehaviour;
import FactoryAndCompositePattern.CompositePattern.Tank;

public class LightTank extends Tank {


    public LightTank(int health, int damage, String name, int speed, AttackBehaviour machinegun, AttackBehaviour missiles){
        super(health, damage, name, speed, machinegun, missiles );
    }
}
