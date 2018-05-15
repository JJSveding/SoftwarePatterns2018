package StrategyPattern.CarBehaviours;

public class LadaHonk implements CarHonkBehaviour {
    @Override
    public void honk() {
        System.out.println("Lada is honking...");
    }
}
