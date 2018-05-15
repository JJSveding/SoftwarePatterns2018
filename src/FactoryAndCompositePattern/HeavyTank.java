package FactoryAndCompositePattern;

public class HeavyTank implements Tank{
    private int damage = 30;
    private int speed = 50;
    private String name = "Heavy tank";

    public HeavyTank(){
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
