package FactoryAndCompositePattern.FactoryPattern;

import FactoryAndCompositePattern.CompositePattern.ConcreteTanks.HeavyTank;
import FactoryAndCompositePattern.CompositePattern.ConcreteTanks.LightTank;
import FactoryAndCompositePattern.CompositePattern.ConcreteTanks.MediumTank;
import FactoryAndCompositePattern.StrategyPattern.ConcreteAttackBehaviours.*;
import FactoryAndCompositePattern.CompositePattern.TankInterface;

public class TankFactory {

    public TankFactory() {
       /*
        There's no need to construct this class, since all
        methods are static.
         */
    }

    public static TankInterface createTank(String typeOfTank) {

        if (typeOfTank.equalsIgnoreCase("heavy")) {
            TankInterface heavyTank = new HeavyTank(100,
                                                    50,
                                                    "Heavy tank",
                                                    15,
                                                    new HeavyTankMachinegun(),
                                                    new HeavyTankMissiles());
            return heavyTank;

        } else if(typeOfTank.equalsIgnoreCase("medium"))
        {
            TankInterface mediumTank = new MediumTank(  75,
                                                        20,
                                                        "Medium tank",
                                                        50,
                                                        new MediumTankMachineGun(),
                                                        new MediumTankMissiles());
            return mediumTank;

        }else if (typeOfTank.equalsIgnoreCase("light")) {
            TankInterface lightTank = new LightTank(50,
                                                    10,
                                                    "Light tank",
                                                    100,
                                                    new LightTankMachinegun(),
                                                    new LightTankMissiles());
            return lightTank;
        }
        else{
            return null;
        }
    }
}