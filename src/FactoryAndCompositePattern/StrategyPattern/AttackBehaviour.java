package FactoryAndCompositePattern.StrategyPattern;

import FactoryAndCompositePattern.CompositePattern.TankInterface;

public interface AttackBehaviour {
    public void shoot(TankInterface shooter, TankInterface target);
}
