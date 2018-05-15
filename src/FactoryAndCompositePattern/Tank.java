package FactoryAndCompositePattern;

public abstract class Tank implements TankInterface {
    private int damage;
    private int speed;
    private String name;

    @Override
    public void shoot() {
        System.out.println(this.name + " SHOOTS and does " + damage + " damage");
    }

    @Override
    public void drive(int distance) {
        System.out.println(this.name + " drives " + distance + " with the speed " + speed + "km/h");
    }

    public void displayTank(){
        String tankInfo = "The " + name + " has a top speed of " + speed +
                " and an attack power of " + damage;
        System.out.println(tankInfo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
