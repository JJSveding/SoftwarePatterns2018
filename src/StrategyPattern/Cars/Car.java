package StrategyPattern.Cars;

import StrategyPattern.CarBehaviours.CarHonkBehaviour;

public abstract class Car
{

    private CarHonkBehaviour carBehaviour;

    public Car(CarHonkBehaviour carBehaviour)
    {

        this.carBehaviour = carBehaviour;

    }

    public void honk()
    {
        carBehaviour.honk();
    }

    public void drive()
    {

        //System.out.println(this.getClass().getName().substring(17)+ " drives");
        System.out.println(this.getClass().getName().substring(8+13) + " drives");
    }

}
