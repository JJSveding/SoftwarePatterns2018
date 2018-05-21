package FactoryAndCompositePattern.StrategyPattern.ConcreteAttackBehaviours;

import FactoryAndCompositePattern.StrategyPattern.TankMachinegun;

public class LightTankMachinegun extends TankMachinegun {

    public LightTankMachinegun() {
        super(2, 15);
    }
}
