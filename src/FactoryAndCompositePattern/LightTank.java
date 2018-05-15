package FactoryAndCompositePattern;

public class LightTank implements Tank {
    private int damage = 10;
    private int speed = 100;
    private String name = "Light tank";

    public LightTank(){
        System.out.println(name + " has been built");
    }

    @Override
    public void shoot() {
        System.out.println(this.name + " SHOOTS and does " + damage + " damage");
    }

    @Override
    public void drive(int distance) {
        System.out.println(this.name + " drives " + distance + " with the speed " + speed + "km/h");
    }




}
