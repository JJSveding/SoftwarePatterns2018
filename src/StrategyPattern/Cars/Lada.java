package StrategyPattern.Cars;

import StrategyPattern.CarBehaviours.CarHonkBehaviour;
import StrategyPattern.CarBehaviours.LadaHonk;

public class Lada extends Car
{

    //Constructor
    public Lada()
    {
        //Call Car constructor with a CarHonBehaviour
        super(new LadaHonk());
    }

    public Lada(CarHonkBehaviour cb)
    {
        super(cb);
    }

}
