package StrategyPattern;

import StrategyPattern.CarBehaviours.RangeRoverHonk;
import StrategyPattern.Cars.Car;
import StrategyPattern.Cars.Lada;
import StrategyPattern.Cars.RangeRover;

public class Test {

    public static void main(String[] args)
    {

        Car rangeRover = new RangeRover();
        Car lada = new Lada();

        rangeRover.honk();
        rangeRover.drive();
        System.out.println("");
        lada.honk();
        lada.drive();

        System.out.println("");
        //Changing car behaviour under run time
        lada = new Lada(new RangeRoverHonk());
        lada.drive();
        lada.honk();




    }
}
