package StrategyPattern.Cars;

import StrategyPattern.CarBehaviours.RangeRoverHonk;

/**
 * Created by Bahrt on 03/06/16.
 */
public class RangeRover extends Car
{

    //Constructor
    public RangeRover()
    {
        //Call Car constructor with a CarHonBehaviour
        super(new RangeRoverHonk());
    }

    
}
